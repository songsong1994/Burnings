package com.example.administrator.burning;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.administrator.burning.adapter.ArtistListAdapter;
import com.example.administrator.burning.beans.TeacherList;
import com.example.administrator.burning.requestdata.APP;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 教师列表
 */
public class ArtistListActivity extends AppCompatActivity implements Callback<TeacherList> {
    private RecyclerView recyclerView;
    private APP app;
    private ArtistListAdapter adapter;
    private int page = 1;
    private List<TeacherList.DataBean.ListBean> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);
        recyclerView = (RecyclerView) findViewById(R.id.artifact_recycler_list);
        app = (APP) getApplication();
        app.getServer().getlist(page).enqueue(this);
        final GridLayoutManager layoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(final RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0 && page<2) {
                    //第一个Item位置
                    int visibleItemCount = layoutManager.getChildCount();
                    //当前可见的Item个数
                    int totalItemCount = layoutManager.getItemCount();
                    //item总数
                    int pastVisiblesItems = layoutManager.findFirstVisibleItemPosition();
                    if ( (visibleItemCount + pastVisiblesItems) >= totalItemCount - 3) {
                        page ++;
                        app.getServer().getlist(page).enqueue(new Callback<TeacherList>() {
                            @Override
                            public void onResponse(Call<TeacherList> call, Response<TeacherList> response) {
                                list.addAll(response.body().getData().getList());
                                adapter.notifyDataSetChanged();
                            }

                            @Override
                            public void onFailure(Call<TeacherList> call, Throwable t) {
                                t.printStackTrace();
                            }
                        });

                    }
                }
            }
        });
    }
    public void back(View view){
        this.finish();
    }
    @Override
    public void onResponse(Call<TeacherList> call, Response<TeacherList> response) {
        list = response.body().getData().getList();
        adapter = new ArtistListAdapter(ArtistListActivity.this,list);
        recyclerView.setAdapter(adapter);
//        int spanCount = 3;
//        int spacing = 30;
//        boolean includeEdge = false;
//        recyclerView.addItemDecoration(new GridSpacingItemDecoration(spanCount,spacing,includeEdge));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(0,20,0,20);
            }
        });
    }

    @Override
    public void onFailure(Call<TeacherList> call, Throwable t) {
        t.printStackTrace();
    }
}
