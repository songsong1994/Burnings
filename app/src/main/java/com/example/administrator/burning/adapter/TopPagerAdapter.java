package com.example.administrator.burning.adapter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */

public class TopPagerAdapter extends PagerAdapter{
    private List<SimpleDraweeView> data;
    private Context context;

    public TopPagerAdapter(Context context,List<SimpleDraweeView> list) {
        this.data = list;
        this.context = context;
    }



    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(data.get(position));
        return data.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(data.get(position));
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view==object;
    }
    public void addAll(List<SimpleDraweeView>list){
        this.data.addAll(list);
        notifyDataSetChanged();
    }
}
