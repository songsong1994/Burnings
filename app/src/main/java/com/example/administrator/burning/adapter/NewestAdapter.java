package com.example.administrator.burning.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.OrderEvent;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by WeihuaWang on 2017/6/13.
 */

public class NewestAdapter extends BaseAdapter {
    List<OrderEvent.DataBean.ListBean> list;
    Context context;

    public NewestAdapter(List<OrderEvent.DataBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
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
        final ViewHolder viewHolder;
        OrderEvent.DataBean.ListBean listBean = list.get(position);
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(context);
            convertView=inflater.inflate(R.layout.item_newest_layout,parent,false);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder= (NewestAdapter.ViewHolder) convertView.getTag();
        }
        Uri uri=Uri.parse(listBean.getPhoto().getUrl().toString());
        viewHolder.sdv.setImageURI(uri);
        Uri uri1=Uri.parse(listBean.getTeacher().getAvatar().toString());
        viewHolder.sdv_coin.setImageURI(uri1);
        viewHolder.tv_address.setText(listBean.getLocation().getName());
        viewHolder.tv_distance.setText(listBean.getDistance()+"");
        viewHolder.tv_price.setText("￥"+listBean.getPrice());
        viewHolder.tv_teacher.setText(listBean.getTeacher().getName());
        viewHolder.tv_user.setText(listBean.getTeacher().getNickname());
        return convertView;
    }
    class ViewHolder{
        //private final TextView tv_day;
       // private final TextView tv_month;
       // private final TextView tv_week;
         TextView tv_user;
         TextView tv_price;
      //  private final TextView tv_user_type;
        TextView tv_teacher;
         TextView tv_distance;
       TextView tv_address;
        SimpleDraweeView sdv_coin;
        SimpleDraweeView sdv;

        public ViewHolder(View view) {
            sdv = (SimpleDraweeView) view.findViewById(R.id.item_newest_iv);
            sdv_coin = (SimpleDraweeView) view.findViewById(R.id.event_newest_coin_iv);
          //  tv_day = (TextView)view.findViewById(R.id.item_newest_day_tv);
          //  tv_month = (TextView) view.findViewById(R.id.item_newest_month_tv);
          //  tv_week = (TextView) view.findViewById(R.id.item_newest_weektime_tv);
            tv_user = (TextView) view.findViewById(R.id.event_newest_user_tv);
            tv_price = (TextView) view.findViewById(R.id.event_newest_price_tv);
          //  tv_user_type = (TextView) view.findViewById(R.id.event_newest_user_type);
            tv_teacher = (TextView) view.findViewById(R.id.event_newest_teacther_tv);
            tv_distance = (TextView) view.findViewById(R.id.event_newest_distance_tv);
            tv_address = (TextView) view.findViewById(R.id.event_newest_address_tv);
        }
    }
    }






