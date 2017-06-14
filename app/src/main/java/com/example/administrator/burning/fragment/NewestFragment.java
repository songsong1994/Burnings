package com.example.administrator.burning.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrator.burning.OrderEventDetailActivity;
import com.example.administrator.burning.R;
import com.example.administrator.burning.adapter.NewestAdapter;
import com.example.administrator.burning.beans.OrderEvent;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewestFragment extends Fragment implements Callback<OrderEvent>, AdapterView.OnItemClickListener {


    private ListView lv;
    private List<OrderEvent.DataBean.ListBean> list;
    private NewestAdapter adapter;

    public NewestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_newest, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lv = (ListView) view.findViewById(R.id.fragment_newest_lv);
        Fresco.initialize(getActivity());
        APP app = (APP) getActivity().getApplication();
        app.getServer().getOrderEvent().enqueue(this);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onResponse(Call<OrderEvent> call, Response<OrderEvent> response) {
        list = response.body().getData().getList();
        adapter = new NewestAdapter(list, getActivity());
        lv.setAdapter(adapter);
    }

    @Override
    public void onFailure(Call<OrderEvent> call, Throwable t) {
        t.printStackTrace();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(getContext(), OrderEventDetailActivity.class);
        intent.putExtra("id", list.get(position).getId());
        startActivity(intent);
    }
}
