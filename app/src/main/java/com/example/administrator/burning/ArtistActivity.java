package com.example.administrator.burning;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.burning.beans.TeacherIntroduce;
import com.example.administrator.burning.fragment.ArtistFragment;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.view.SimpleDraweeView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ArtistActivity extends AppCompatActivity implements Callback<TeacherIntroduce> {
    private APP app;
    private TeacherIntroduce.DataBean data;
    public SimpleDraweeView url,avatar;
    public TextView friendnum,followerNum,eventnum,statusNum,artifactNum,nickname;
    private View img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_artist_view);
        showInfo();
        img.setAlpha(0.6f);
        String userId = getIntent().getStringExtra("userId");
        app = ((APP) getApplication());
        app.getServer().getintroduce(userId).enqueue(this);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        ArtistFragment fragment = new ArtistFragment();
        Bundle bundle = new Bundle();
        bundle.putString("userId",userId);
        fragment.setArguments(bundle);
        transaction.replace(R.id.artist_top_framelayout,fragment);
        transaction.commit();

    }

    @Override
    public void onResponse(Call<TeacherIntroduce> call, Response<TeacherIntroduce> response) {
        data = response.body().getData();
        Uri uri = Uri.parse(data.getBackgroundPhoto().getUrl().toString());
        url.setImageURI(uri);
        Uri uri1 = Uri.parse(data.getAvatar().toString());
        avatar.setImageURI(uri1);
        nickname.setText(data.getNickname().toString());
        friendnum.setText(data.getFriendNum()+"");
        followerNum.setText(data.getFollowerNum()+"");
        eventnum.setText(data.getEventNum()+"");
        statusNum.setText(data.getStatusNum()+"");
        artifactNum.setText(data.getArtifactNum()+"");
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

    }
    public void back(View view){
        this.finish();
    }
}
