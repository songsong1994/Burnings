package com.example.administrator.burning;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.burning.fragment.ArtistFragment;


public class ArtistActivity extends AppCompatActivity {
//    private RecyclerView recyclerView;
//    private ArtistAdapter adapter;
//    private APP app;
//    private List<TeacherEvents.DataBean.ListBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_artist_view);
//        recyclerView = (RecyclerView) findViewById(R.id.artist_listview);
//        app = ((APP) getApplication());
//        app.getServer().getevents().enqueue(this);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.artist_top_framelayout,new ArtistFragment());
        transaction.commit();
//    @Override
//    public void onResponse(Call<TeacherEvents> call, Response<TeacherEvents> response) {
//        list = response.body().getData().getList();

//        adapter = new ArtistAdapter(this,list);
//        recyclerView.setAdapter(adapter);
//        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
//            @Override
//            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
//                super.getItemOffsets(outRect, view, parent, state);
//                outRect.set(0,20,0,20);
//            }
//        });
//    }

//    @Override
//    public void onFailure(Call<TeacherEvents> call, Throwable t) {
//
    }
}
