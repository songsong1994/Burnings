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
import com.example.administrator.burning.adapter.ArtistArtifactAdapter;
import com.example.administrator.burning.beans.TeacherArtifact;
import com.example.administrator.burning.requestdata.APP;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 艺术家作品Fragment
 * A simple {@link Fragment} subclass.
 */
public class ArtistArtifactFragment extends Fragment implements Callback<TeacherArtifact> {

    private RecyclerView recyclerView;
    private APP app;
    private List<TeacherArtifact.DataBean.ListBean> list;
    private ArtistArtifactAdapter adapter;
    private Bundle bundle;

    public ArtistArtifactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artist_artifact, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.artifact_recycler);
        bundle = getArguments();
        String userId = bundle.getString("userId");
        app = (APP) getActivity().getApplication();
        app.getServer().getartifact(userId).enqueue(this);
    }

    @Override
    public void onResponse(Call<TeacherArtifact> call, Response<TeacherArtifact> response) {
        list = response.body().getData().getList();
        String img = bundle.getString("img");
        adapter = new ArtistArtifactAdapter(getActivity(),list,img);
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
    public void onFailure(Call<TeacherArtifact> call, Throwable t) {
        t.printStackTrace();
    }
}
