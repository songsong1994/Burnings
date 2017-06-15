package com.example.administrator.burning;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.burning.beans.TecherStatusDetails;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.view.SimpleDraweeView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StatusDetailsActivity extends AppCompatActivity implements Callback<TecherStatusDetails> {
    private APP app;
    private SimpleDraweeView img,bigimg;
    private TextView name,date,body,liked,mark,comment;
    private String id,img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_details);
        showInfo();
        id = getIntent().getStringExtra("id");
        img1 = getIntent().getStringExtra("img");
        app = (APP) getApplication();
        app.getServer().getstatusDetails(id).enqueue(this);

    }

    @Override
    public void onResponse(Call<TecherStatusDetails> call, Response<TecherStatusDetails> response) {
        TecherStatusDetails.DataBean bean = response.body().getData();
        if (img1!=null) {
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
        String time=bean.getCreated();
        StringBuffer buffer = new StringBuffer(time);
        StringBuffer delete = buffer.delete(0, 5);
        StringBuffer delete1 = delete.delete(11, 14);
        date.setText(delete1.toString());
        liked.setText(bean.getLikeNum()+"");
        mark.setText(bean.getMarkNum()+"");
        comment.setText(bean.getCommentNum() + "");
//        if (bean.getContent()==null) {
            body.setText("#无");
//        }else {
//            body.setText(bean.getContent());
//        }
    }
    public void back(View view){
        this.finish();
    }
    @Override
    public void onFailure(Call<TecherStatusDetails> call, Throwable t) {
        t.printStackTrace();
    }
    public void showInfo(){
        body = (TextView) findViewById(R.id.artist_rec_body1);
        img = (SimpleDraweeView) findViewById(R.id.artist_rec_simple1);
        bigimg = (SimpleDraweeView) findViewById(R.id.artist_rec_simplebig1);
        name = (TextView) findViewById(R.id.artist_rec_name1);
        date = (TextView) findViewById(R.id.artist_rec_time1);
        liked = (TextView) findViewById(R.id.artist_rec_liked1);
        mark = (TextView) findViewById(R.id.artist_rec_mark1);
        comment = (TextView) findViewById(R.id.artist_rec_comment1);
    }

}
