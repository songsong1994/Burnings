package com.example.administrator.burning;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.burning.beans.TeacherIntroduce;
import com.example.administrator.burning.fragment.ArtistArtifactFragment;
import com.example.administrator.burning.fragment.ArtistFragment;
import com.example.administrator.burning.fragment.ArtistNullFragment;
import com.example.administrator.burning.fragment.ArtistStatusFragment;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.view.SimpleDraweeView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 艺术家详情
 */
public class ArtistActivity extends AppCompatActivity implements Callback<TeacherIntroduce> {
    private APP app;
    private TeacherIntroduce.DataBean data;
    public SimpleDraweeView url,avatar;
    public TextView friendnum,followerNum,eventnum,statusNum,artifactNum,nickname,eventnum1,statusNum1,artifactNum1;
    private View img;
    private String userId;
    private ArtistNullFragment nullf=new ArtistNullFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_artist_view);
        showInfo();
        img.setAlpha(0.6f);
        userId = getIntent().getStringExtra("userId");
        app = ((APP) getApplication());
        app.getServer().getintroduce(userId).enqueue(this);

    }

    @Override
    public void onResponse(Call<TeacherIntroduce> call, Response<TeacherIntroduce> response) {
        data = response.body().getData();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (data.getEventNum() > 0) {
            ArtistFragment fragment = new ArtistFragment();
            Bundle bundle = new Bundle();
            bundle.putString("userId",userId);
            fragment.setArguments(bundle);
            transaction.replace(R.id.artist_top_framelayout,fragment);
            artistFragment();
        }else {
            transaction.replace(R.id.artist_top_framelayout,nullf);
            artistFragment();
        }
        transaction.commit();

        if (data.getBackgroundPhoto() != null) {
            Uri uri = Uri.parse(data.getBackgroundPhoto().getUrl().toString());
            url.setImageURI(uri);
        }
        if (data.getAvatar() != null) {
            Uri uri1 = Uri.parse(data.getAvatar().toString());
            avatar.setImageURI(uri1);
        }
        if (data.getName() != null) {
            nickname.setText(data.getName().toString());
        }else {
            nickname.setText("不详");
        }

        friendnum.setText(data.getFriendNum()+"");
        followerNum.setText(data.getFollowerNum()+"");
        eventnum.setText(data.getEventNum()+"个");
        statusNum.setText(data.getStatusNum()+"个");
        artifactNum.setText(data.getArtifactNum()+"个");
    }

    @Override
    public void onFailure(Call<TeacherIntroduce> call, Throwable t) {
        t.printStackTrace();
    }

    public void showInfo(){
        img = findViewById(R.id.introduce_bg_image);
        url = (SimpleDraweeView) findViewById(R.id.introduce_bg_url);
        avatar = (SimpleDraweeView)findViewById(R.id.artist_top_avatar);
        nickname = (TextView) findViewById(R.id.introduce_nickname);
        friendnum = (TextView) findViewById(R.id.introduce_friendNum);
        followerNum = (TextView)findViewById(R.id.introduce_followerNum);
        eventnum = (TextView) findViewById(R.id.introduce_eventnum);
        statusNum = (TextView) findViewById(R.id.introduce_statusNum);
        artifactNum = (TextView) findViewById(R.id.introduce_artifactNum);
        eventnum1 = (TextView) findViewById(R.id.introduce_eventnum1);
        statusNum1 = (TextView) findViewById(R.id.introduce_statusNum1);
        artifactNum1 = (TextView) findViewById(R.id.introduce_artifactNum1);
    }
    public void more(View view){
        Intent intent = new Intent(this,ArtistDetailsActivity.class);
        intent.putExtra("userId",userId);
        startActivity(intent);
    }
    public void back(View view){
        this.finish();
    }
    public void go(View view) {
        startActivity(new Intent(this,ArtistListActivity.class));
    }
    public void  fragment_click(View view){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.fragment_event:
                ArtistFragment fragment = new ArtistFragment();
                if (data.getEventNum() > 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("userId",userId);
                    fragment.setArguments(bundle);
                    transaction.replace(R.id.artist_top_framelayout,fragment);
                    artistFragment();
                }else {
                    transaction.replace(R.id.artist_top_framelayout,nullf);
                    artistFragment();
                }
                break;
            case R.id.fragment_status:
                if (data.getStatusNum() > 0) {
                    ArtistStatusFragment status = new ArtistStatusFragment();
                    Bundle bundleStatus = new Bundle();
                    bundleStatus.putString("userId",userId);
                    bundleStatus.putString("img",data.getAvatar());
                    status.setArguments(bundleStatus);
                    transaction.replace(R.id.artist_top_framelayout,status);
                    artistNullFragment();
                }else {
                    transaction.replace(R.id.artist_top_framelayout,nullf);
                    artistNullFragment();
                }
                break;
            case R.id.fragment_artifact:
                if (data.getStatusNum() > 0) {
                    ArtistArtifactFragment artifact = new ArtistArtifactFragment();
                    Bundle bundleStatus = new Bundle();
                    bundleStatus.putString("userId",userId);
                    bundleStatus.putString("img",data.getAvatar());
                    artifact.setArguments(bundleStatus);
                    transaction.replace(R.id.artist_top_framelayout,artifact);
                    artifactFragment();
                }else {
                    transaction.replace(R.id.artist_top_framelayout,nullf);
                    artifactFragment();
                }
                break;

        }
        transaction.commit();
    }

    public void artistFragment(){
        eventnum.setTextColor(Color.BLACK);
        eventnum1.setTextColor(Color.BLACK);
        statusNum.setTextColor(Color.GRAY);
        statusNum1.setTextColor(Color.GRAY);
        artifactNum.setTextColor(Color.GRAY);
        artifactNum1.setTextColor(Color.GRAY);
    }
    public void artistNullFragment(){
        eventnum.setTextColor(Color.GRAY);
        eventnum1.setTextColor(Color.GRAY);
        statusNum.setTextColor(Color.BLACK);
        statusNum1.setTextColor(Color.BLACK);
        artifactNum.setTextColor(Color.GRAY);
        artifactNum1.setTextColor(Color.GRAY);
    }
    public void artifactFragment(){
        eventnum.setTextColor(Color.GRAY);
        eventnum1.setTextColor(Color.GRAY);
        statusNum.setTextColor(Color.GRAY);
        statusNum1.setTextColor(Color.GRAY);
        artifactNum.setTextColor(Color.BLACK);
        artifactNum1.setTextColor(Color.BLACK);
    }
}
