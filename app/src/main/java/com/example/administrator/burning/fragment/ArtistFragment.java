package com.example.administrator.burning.fragment;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.burning.R;
import com.example.administrator.burning.adapter.ArtistAdapter;
import com.example.administrator.burning.beans.TeacherEvents;
import com.example.administrator.burning.requestdata.APP;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 艺术家活动Fragment
 * A simple {@link Fragment} subclass.
 */
public class ArtistFragment extends Fragment implements Callback<TeacherEvents> {
    private RecyclerView recyclerView;
    private ArtistAdapter adapter;
    private APP app ;
    private List<TeacherEvents.DataBean.ListBean> list;


    public ArtistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_artist, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView)view.findViewById(R.id.artist_listview);
        Bundle bundle = getArguments();
        String userId = bundle.getString("userId");
        app = (APP) getActivity().getApplication();
        app.getServer().getevents(userId).enqueue(this);
    }


    @Override
    public void onResponse(Call<TeacherEvents> call, Response<TeacherEvents> response) {
        list = response.body().getData().getList();
        adapter = new ArtistAdapter(getContext(),list);
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
        t.printStackTrace();
    }
}
