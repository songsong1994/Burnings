package com.example.administrator.burning.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.bean.Space;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/14.
 */

public class HomeListAdapter extends BaseAdapter {
    private Context context;
    private List<Space.DataBean.PostTopicsBean>list;

    public HomeListAdapter(Context context, List<Space.DataBean.PostTopicsBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder=null;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.home_list_item,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.sdv.setImageURI(list.get(position).getPhoto().getUrl());
        holder.sdv.setAspectRatio(list.get(position).getPhoto().getWidth()/list.get(position).getPhoto().getHeight());
        holder.title.setText(list.get(position).getTitle());
        holder.subtitle.setText(list.get(position).getSubtitle());
        return convertView;
    }
    public void addAll(List<Space.DataBean.PostTopicsBean>list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    public class ViewHolder{
        public SimpleDraweeView sdv;
        public TextView title;
        public TextView subtitle;
        public ViewHolder(View v){
            sdv= (SimpleDraweeView) v.findViewById(R.id.img_recommend_item);
            title= (TextView) v.findViewById(R.id.title_burning_item);
            subtitle = (TextView) v.findViewById(R.id.subject_burning_item);
        }

    }
}
