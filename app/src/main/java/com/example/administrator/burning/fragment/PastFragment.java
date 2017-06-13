package com.example.administrator.burning.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.adapter.PastFragmentAdapter;
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
public class PastFragment extends Fragment implements Callback<History> {
    private ListView lv;
    private PastFragmentAdapter pastFragmentAdapter;
    private List<History.DataBean.ListBean> totaildata=new ArrayList<>();



    public PastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_past, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        lv= (ListView) view.findViewById(R.id.pastfragment_list);
        APP app = (APP) getActivity().getApplication();
        app.getServer().gethistory().enqueue(this);
        pastFragmentAdapter=new PastFragmentAdapter(getActivity(),totaildata);
        lv.setAdapter(pastFragmentAdapter);
    }

    @Override
    public void onResponse(Call<History> call, Response<History> response) {
        totaildata.addAll(response.body().getData().getList());
        pastFragmentAdapter.notifyDataSetChanged();

    }

    @Override
    public void onFailure(Call<History> call, Throwable t) {

    }
}
