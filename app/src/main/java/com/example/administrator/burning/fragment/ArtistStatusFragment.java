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
import com.example.administrator.burning.adapter.ArtistStatusAdapter;
import com.example.administrator.burning.beans.TecherStatus;
import com.example.administrator.burning.requestdata.APP;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 艺术家时刻Fragment
 * A simple {@link Fragment} subclass.
 */
public class ArtistStatusFragment extends Fragment implements Callback<TecherStatus> {

    private RecyclerView recyclerview;
    private APP app;
    private ArtistStatusAdapter adapter;
    private Bundle bundle;

    public ArtistStatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artist_status, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerview = (RecyclerView) view.findViewById(R.id.artist_recycler);
        bundle = getArguments();
        String userId = bundle.getString("userId");
        app = ((APP) getActivity().getApplication());
        app.getServer().getstatus(userId).enqueue(this);

    }

    @Override
    public void onResponse(Call<TecherStatus> call, Response<TecherStatus> response) {
        List<TecherStatus.DataBean.ListBean> list = response.body().getData().getList();
        String img = bundle.getString("img");
        adapter = new ArtistStatusAdapter(getActivity(),list,img);
        recyclerview.setAdapter(adapter);
        recyclerview.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(0,20,0,20);
            }
        });
    }

    @Override
    public void onFailure(Call<TecherStatus> call, Throwable t) {
        t.printStackTrace();
    }
}
