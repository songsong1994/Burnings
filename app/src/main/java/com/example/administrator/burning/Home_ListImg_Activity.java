package com.example.administrator.burning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.example.administrator.burning.adapter.HomeListAdapter;
import com.example.administrator.burning.bean.Space;
import com.example.administrator.burning.requestdata.APP;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home_ListImg_Activity extends AppCompatActivity implements Callback<Space> {

    private ListView lv;
    private List<Space.DataBean.PostTopicsBean>list;
    private HomeListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__list_img_);
        lv = (ListView) findViewById(R.id.home_listView);
        list = new ArrayList<>();
        adapter = new HomeListAdapter(this,list);
        lv.setAdapter(adapter);
        APP app = (APP) getApplication();
        app.getServer().getSpace().enqueue(this);
    }

    @Override
    public void onResponse(Call<Space> call, Response<Space> response) {
        adapter.addAll(response.body().getData().getPostTopics());
    }

    @Override
    public void onFailure(Call<Space> call, Throwable t) {

    }
    public void back(View view){
        this.finish();
    }
}
