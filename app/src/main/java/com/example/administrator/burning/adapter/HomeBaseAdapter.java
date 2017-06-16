package com.example.administrator.burning.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.bean.HomeListData;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */

public class HomeBaseAdapter extends BaseAdapter{
    private Context context;
    private List<HomeListData.DataBean.ListBean> list;

    public HomeBaseAdapter(Context context, List<HomeListData.DataBean.ListBean> list) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.artist_recycler_item,parent,false);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        HomeListData.DataBean.ListBean bean = list.get(position);
        holder.avatar.setImageURI(bean.getUser().getAvatar());
        holder.nikeName.setText(bean.getUser().getNickname());
        holder.time.setText(bean.getCreated());
        holder.photo.setImageURI(bean.getPhoto().getUrl());
        if (bean.getContent() != null) {
            holder.contexts.setText(bean.getContent().toString());
        }else {
            holder.contexts.setText("暂无内容");

        }
        holder.like.setText(bean.getLikeNum()+"");

        holder.marke.setText(bean.getMarkNum()+"");
        holder.comment.setText(bean.getCommentNum()+"");
        return convertView;
    }

    public class ViewHolder{
        public SimpleDraweeView avatar,photo;
        public TextView nikeName,time,contexts,like,marke,comment;
        private ViewHolder(View v){
            avatar=((SimpleDraweeView) v.findViewById(R.id.artist_rec_simple));
            photo = (SimpleDraweeView) v.findViewById(R.id.artist_rec_simplebig);
            nikeName = (TextView) v.findViewById(R.id.artist_rec_name);
            time = (TextView) v.findViewById(R.id.artist_rec_time);
            contexts = (TextView) v.findViewById(R.id.artist_rec_body);
            like= (TextView) v.findViewById(R.id.artist_rec_liked);
            marke = (TextView) v.findViewById(R.id.artist_rec_mark);
            comment = (TextView) v.findViewById(R.id.artist_rec_comment);
        }

    }

    public void addAll(List<HomeListData.DataBean.ListBean>list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }
}
