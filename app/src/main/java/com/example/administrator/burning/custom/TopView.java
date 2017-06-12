package com.example.administrator.burning.custom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import com.example.administrator.burning.R;
import com.example.administrator.burning.adapter.TopPagerAdapter;
import com.example.administrator.burning.adapter.TopRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */

public class TopView extends FrameLayout {
    private  RecyclerView recycler;
    private TopRecycleAdapter adapter;

    //--------------------------------
    private  ViewPager pager;
    private TopPagerAdapter adapterPager;
    private  LinearLayout radios;

    public TopView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.top_view,this);
        recycler = (RecyclerView) findViewById(R.id.recycle_top);
        pager = (ViewPager) findViewById(R.id.pager_top);
        radios = (LinearLayout) findViewById(R.id.radios);
        //recyclerView填充数据
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add("程文霞"+i);
        }
        adapter = new TopRecycleAdapter(data,getContext());
        recycler.setAdapter(adapter);
    }
}
