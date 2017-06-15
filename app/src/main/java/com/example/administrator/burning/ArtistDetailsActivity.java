package com.example.administrator.burning;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.burning.beans.TeacherDetails;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.view.SimpleDraweeView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArtistDetailsActivity extends AppCompatActivity implements Callback<TeacherDetails> {

    private APP app;
    private SimpleDraweeView simpleDraweeView;
    private TextView name,body,academy;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_details);
        shouInfo();
        img.setAlpha(0.6f);
        String userId = getIntent().getStringExtra("userId");
        app = (APP) getApplication();
        app.getServer().getdetails(userId).enqueue(this);
    }

    @Override
    public void onResponse(Call<TeacherDetails> call, Response<TeacherDetails> response) {
        TeacherDetails.DataBean data = response.body().getData();
        if (data.getName() != null) {
            name.setText(data.getName());
        }else {name.setText("不详");}
        if (data.getGraduation() != null) {
            academy.setText(data.getGraduation());
        }else {academy.setText("不详");}
        if (data.getIntro() != null) {
            body.setText(data.getIntro());
        }else {body.setText("不详");}

        if (data.getIntroBackgroundPhoto() != null) {
            if (data.getIntroBackgroundPhoto().getUrl() != null) {
                Uri uri = Uri.parse(data.getIntroBackgroundPhoto().getUrl());
                simpleDraweeView.setImageURI(uri);
            }
        }
    }

    @Override
    public void onFailure(Call<TeacherDetails> call, Throwable t) {

    }
    public void shouInfo(){
        simpleDraweeView = (SimpleDraweeView) findViewById(R.id.artist_details_simple);
        name = (TextView) findViewById(R.id.artist_details_name);
        academy = (TextView) findViewById(R.id.artist_details_academy);
        img = (ImageView) findViewById(R.id.artist_details_img);
        body = (TextView) findViewById(R.id.artist_details_body);
    }
    public void back(View v){
        this.finish();
    }
}
