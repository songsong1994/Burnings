package com.example.administrator.burning;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.burning.beans.TeacherArtifactDetails;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.view.SimpleDraweeView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArtifactDetailsActivity extends AppCompatActivity implements Callback<TeacherArtifactDetails> {
    private SimpleDraweeView img,bigimg;
    private TextView name,date,body,time,size,liked,mark,comment;
    private APP app;
    private String img1,id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artifact_details);
        showInfo();
        img1 = getIntent().getStringExtra("img");
        id = getIntent().getStringExtra("id");
        app = (APP) getApplication();
        app.getServer().getartifactDetails(id).enqueue(this);
    }


    @Override
    public void onResponse(Call<TeacherArtifactDetails> call, Response<TeacherArtifactDetails> response) {
        TeacherArtifactDetails.DataBean bean = response.body().getData();
        if (img1 != null) {
            Uri uri = Uri.parse(img1);
            img.setImageURI(uri);
        }
        if (bean.getPhoto() != null) {
            Uri uri1 = Uri.parse(bean.getPhoto().getUrl());
            bigimg.setImageURI(uri1);
        }
        if (bean.getUser() != null) {
            name.setText(bean.getUser().getName());
        }
        liked.setText(bean.getLikeNum()+"");
        comment.setText(bean.getCommentNum()+"");
        if (bean.getCreated() != null) {
            date.setText(bean.getCreated());
        }
        mark.setText(bean.getMarkNum()+"");
        if (bean.getArtifactDate() != null) {
            String time1=bean.getArtifactDate();
            StringBuffer buffer = new StringBuffer(time1);
            StringBuffer delete = buffer.delete(11, 16);
            time.setText(delete.toString());
        }
        if (bean.getArtifactSize() != null) {
            size.setText(bean.getArtifactSize());

        }
        if (bean.getArtifactName() != null) {
            body.setText(bean.getArtifactName());

        }
    }
    public void back(View view){
        this.finish();
    }
    @Override
    public void onFailure(Call<TeacherArtifactDetails> call, Throwable t) {

    }
    public void showInfo(){
        body = (TextView)findViewById(R.id.artifact_rec_body1);
        img = (SimpleDraweeView)findViewById(R.id.artifact_rec_simple1);
        bigimg = (SimpleDraweeView) findViewById(R.id.artifact_rec_simplebig1);
        name = (TextView) findViewById(R.id.artifact_rec_name1);
        date = (TextView) findViewById(R.id.artifact_rec_time1);
        time = (TextView) findViewById(R.id.artifact_time_date1);
        mark = (TextView) findViewById(R.id.artist_rec_mark1);
        liked = (TextView) findViewById(R.id.artist_rec_liked1);
        comment = (TextView) findViewById(R.id.artist_rec_comment1);
        size = (TextView) findViewById(R.id.artifact_size1);
    }
}
