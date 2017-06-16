package com.example.administrator.burning.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.StatusDetailsActivity;
import com.example.administrator.burning.adapter.HomeBaseAdapter;
import com.example.administrator.burning.bean.HomeListData;
import com.example.administrator.burning.custom.TopView;
import com.example.administrator.burning.requestdata.APP;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements Callback<HomeListData> {


    private ListView lv;
    private HomeBaseAdapter adapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        APP app = (APP) getActivity().getApplication();
        app.getServer().getHomeListData().enqueue(this);
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lv = ((ListView) view.findViewById(R.id.lv_home));
        List<String>list = new ArrayList<>();

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,list);
        adapter = new HomeBaseAdapter(getActivity(),new ArrayList<HomeListData.DataBean.ListBean>());
        lv.setAdapter(adapter);
        lv.addHeaderView(new TopView(getActivity()));

    }

    @Override
    public void onResponse(Call<HomeListData> call, final Response<HomeListData> response) {
        adapter.addAll(response.body().getData().getList());
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), StatusDetailsActivity.class);
                intent.putExtra("id",response.body().getData().getList().get(position).getId());
                intent.putExtra("img",response.body().getData().getList().get(position).getUser().getAvatar());
                getActivity().startActivity(intent);
            }
        });
    }

    @Override
    public void onFailure(Call<HomeListData> call, Throwable t) {

    }
}
