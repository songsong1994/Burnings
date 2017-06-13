package com.example.administrator.burning;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.administrator.burning.adapter.ArtistAdapter;
import com.example.administrator.burning.beans.TeacherEvents;
import com.example.administrator.burning.requestdata.APP;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArtistActivity extends AppCompatActivity implements Callback<TeacherEvents> {
    private RecyclerView recyclerView;
    private ArtistAdapter adapter;
    private APP app;
    private List<TeacherEvents.DataBean.ListBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        recyclerView = (RecyclerView) findViewById(R.id.artist_listview);
//        listView.addHeaderView(new ArtistTopView(ArtistActivity.this));
        app = ((APP) getApplication());
        app.getServer().getevents().enqueue(this);

    }

    @Override
    public void onResponse(Call<TeacherEvents> call, Response<TeacherEvents> response) {
        list = response.body().getData().getList();
        adapter = new ArtistAdapter(this,list);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(0,20,0,20);
            }
        });
    }

    @Override
    public void onFailure(Call<TeacherEvents> call, Throwable t) {

    }
}
