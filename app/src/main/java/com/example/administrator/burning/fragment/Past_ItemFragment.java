package com.example.administrator.burning.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.History;
import com.example.administrator.burning.requestdata.APP;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class Past_ItemFragment extends Fragment implements Callback<History> {
    private ImageView back;
    private List<History.DataBean.ListBean> totaildata=new ArrayList<>();

    public Past_ItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_past__item, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        APP app = (APP) getActivity().getApplication();
        app.getServer().gethistory().enqueue(this);
        back= (ImageView) view.findViewById(R.id.past_item_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               getActivity().onBackPressed();

            }
        });
    }

    @Override
    public void onResponse(Call<History> call, Response<History> response) {
        totaildata.addAll(response.body().getData().getList());
    }

    @Override
    public void onFailure(Call<History> call, Throwable t) {

    }
}
