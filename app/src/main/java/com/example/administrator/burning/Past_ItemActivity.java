package com.example.administrator.burning;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.burning.adapter.Past_itemActivity_itemAdapter;
import com.example.administrator.burning.beans.History;
import com.example.administrator.burning.beans.HistoryBetails;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Past_ItemActivity extends AppCompatActivity implements Callback<HistoryBetails> {
    private ImageView back;
    private RecyclerView recyclerView;
    private SimpleDraweeView bigicon,authoricon;
    private TextView title,authorname,time,location,textView;
    private List<History.DataBean.ListBean> data=new ArrayList<>();
    List<HistoryBetails.DataBean.EventUsersBean> source=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past__item);
        String id=getIntent().getStringExtra("id");
        APP app = (APP) getApplication();
        app.getServer().getbetails(id).enqueue(this);
        init();
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(16,16,16,16);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }

    private void init() {
        back= (ImageView)findViewById(R.id.past_item_back);
        recyclerView= (RecyclerView) findViewById(R.id.past_item_recyclerview);
        bigicon= (SimpleDraweeView) findViewById(R.id.past_item_bigicon);
        title= (TextView) findViewById(R.id.past_item_title);
        authoricon= (SimpleDraweeView) findViewById(R.id.past_item_authoricon);
        authorname= (TextView) findViewById(R.id.past_item_authorname);
        time= (TextView) findViewById(R.id.past_item_time);
        location= (TextView) findViewById(R.id.action_past_layout3_tv_location);
        textView= (TextView) findViewById(R.id.past_item_tv);
    }

    @Override
    public void onResponse(Call<HistoryBetails> call, Response<HistoryBetails> response) {
        HistoryBetails.DataBean listBean = response.body().getData();
        Uri uri=Uri.parse(listBean.getPhoto().getUrl());
        bigicon.setImageURI(uri);
        title.setText(listBean.getTopic());
        Uri uri1=Uri.parse(listBean.getTeacher().getAvatar());
        authoricon.setImageURI(uri1);
        authorname.setText(listBean.getTeacher().getName());
        time.setText(listBean.getStartTime());
        location.setText(listBean.getLocation().getName());
        source= listBean.getEventUsers();
        Past_itemActivity_itemAdapter past_itemActivity_itemAdapter = new Past_itemActivity_itemAdapter(source, this);
        recyclerView.setAdapter(past_itemActivity_itemAdapter);
        int a= listBean.getEventUsers().size();
        textView.setText("共"+a+"张动态，看看燃友的燃时刻");
    }

    @Override
    public void onFailure(Call<HistoryBetails> call, Throwable t) {
        t.printStackTrace();
    }
}
