package com.example.administrator.burning.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.History;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;


/**
 * Created by Administrator on 2017/6/12.
 */

public class PastFragmentAdapter extends BaseAdapter {
    private Context context;
    private List<History.DataBean.ListBean> data;

    public PastFragmentAdapter(Context context, List<History.DataBean.ListBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        History.DataBean.ListBean listBean=data.get(position);
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(context);
            convertView=inflater.inflate(R.layout.activity_past_item,parent,false);
            viewHolder=new ViewHolder(convertView);

            convertView.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Uri uri=Uri.parse(listBean.getPhoto().getUrl());
        viewHolder.icon.setImageURI(uri);
        viewHolder.tv1_name.setText(listBean.getTopic());
        viewHolder.tv3_author.setText(listBean.getTeacher().getName());
        viewHolder.tv4_location.setText(listBean.getLocation().getName());
        viewHolder.tv5_time.setText(listBean.getStartTime());
//        if (listBean.getPosts().size()>0) {
//            Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
//            viewHolder.icon1.setImageURI(uri1);
//        }

      if(listBean.getPosts().size()==1){
          Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
          viewHolder.icon1.setImageURI(uri1);
          //viewHolder.icon1.setVisibility(View.VISIBLE);
      }
        else if(listBean.getPosts().size()==2){
            Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
            viewHolder.icon1.setImageURI(uri1);
           // viewHolder.icon1.setVisibility(View.VISIBLE);
          Uri uri2=Uri.parse(listBean.getPosts().get(1).getPhoto().getUrl());
          viewHolder.icon2.setImageURI(uri2);
         // viewHolder.icon2.setVisibility(View.VISIBLE);
        }
      else if(listBean.getPosts().size()==3){
          Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
          viewHolder.icon1.setImageURI(uri1);
          //viewHolder.icon1.setVisibility(View.VISIBLE);
          Uri uri2=Uri.parse(listBean.getPosts().get(1).getPhoto().getUrl());
          viewHolder.icon2.setImageURI(uri2);
         // viewHolder.icon2.setVisibility(View.VISIBLE);
          Uri uri3=Uri.parse(listBean.getPosts().get(2).getPhoto().getUrl());
          viewHolder.icon3.setImageURI(uri3);
          //viewHolder.icon3.setVisibility(View.VISIBLE);
      }
      else if(listBean.getPosts().size()>3){
          Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
          viewHolder.icon1.setImageURI(uri1);
          //viewHolder.icon1.setVisibility(View.VISIBLE);
          Uri uri2=Uri.parse(listBean.getPosts().get(1).getPhoto().getUrl());
          viewHolder.icon2.setImageURI(uri2);
          // viewHolder.icon2.setVisibility(View.VISIBLE);
          Uri uri3=Uri.parse(listBean.getPosts().get(2).getPhoto().getUrl());
          viewHolder.icon3.setImageURI(uri3);
          //viewHolder.icon3.setVisibility(View.VISIBLE);
          viewHolder.icon4.setImageResource(R.mipmap.more);
      }
//        if(listBean.getPosts().size()!=0){
//            for(int i=0;i<listBean.getPosts().size();i++){
//                ImageView imageView=new ImageView(context);
//                Uri uri1=Uri.parse(listBean.getPosts().get(i).getPhoto().getUrl());
//                imageView.setImageURI(uri1);
//                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(30, 30);
//                imageView.setLayoutParams(params);
//                viewHolder.layout.addView(imageView);
//            }
//        }


        return convertView;
    }
    class ViewHolder{
        SimpleDraweeView icon,icon1,icon2,icon3,icon4;
       //ImageView icon;
        TextView tv1_name,tv3_author,tv4_location,tv5_time;
        LinearLayout layout;

        public ViewHolder(View view) {
            icon= (SimpleDraweeView) view.findViewById(R.id.action_past_iv_id);
            icon1= (SimpleDraweeView) view.findViewById(R.id.action_past_layout5_iv1_id);
            icon2= (SimpleDraweeView) view.findViewById(R.id.action_past_layout5_iv2_id);
            icon3= (SimpleDraweeView) view.findViewById(R.id.action_past_layout5_iv3_id);
            icon4= (SimpleDraweeView) view.findViewById(R.id.action_past_layout5_iv4_id);
            tv1_name= (TextView) view.findViewById(R.id.action_past_layout1_tv_name);
            tv3_author= (TextView) view.findViewById(R.id.action_past_layout2_tv_author);
            tv4_location= (TextView) view.findViewById(R.id.action_past_layout3_tv_location);
            tv5_time= (TextView) view.findViewById(R.id.action_past_layout3_tv_time);
            layout= (LinearLayout) view.findViewById(R.id.action_past_layout4);
        }
    }
}
