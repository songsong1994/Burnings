package com.example.administrator.burning.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.burning.Past_ItemActivity;
import com.example.administrator.burning.R;
import com.example.administrator.burning.StatusDetailsActivity;
import com.example.administrator.burning.beans.History;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;


/**
 * Created by Administrator on 2017/6/12.
 */

public class PastFragmentAdapter extends BaseAdapter  {
    private Context context;
    private List<History.DataBean.ListBean> data;
    private boolean iscollection=false;
    private String id1,id2,id3,img;


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
    public View getView(final int position, View convertView, ViewGroup parent) {
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
        if(listBean.getTeacher()==null){
            viewHolder.tv3_author.setText("不详");
        }
        else{
            viewHolder.tv3_author.setText(listBean.getTeacher().getName());
        }
        viewHolder.tv4_location.setText(listBean.getLocation().getName());
        viewHolder.tv5_time.setText(listBean.getStartTime());

            if(listBean.getPosts().size()==0){
                viewHolder.icon1.setVisibility(View.INVISIBLE);
                viewHolder.icon2.setVisibility(View.INVISIBLE);
                viewHolder.icon3.setVisibility(View.INVISIBLE);
                viewHolder.icon4.setVisibility(View.INVISIBLE);
            }
      else if(listBean.getPosts().size()==1){
          Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
          viewHolder.icon1.setImageURI(uri1);
                viewHolder.icon1.setVisibility(View.VISIBLE);
                viewHolder.icon2.setVisibility(View.INVISIBLE);
                viewHolder.icon3.setVisibility(View.INVISIBLE);
                viewHolder.icon4.setVisibility(View.INVISIBLE);
                id1= listBean.getPosts().get(0).getId();
                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id1);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
      }
        else if(listBean.getPosts().size()==2){
            Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
            viewHolder.icon1.setImageURI(uri1);
                viewHolder.icon1.setVisibility(View.VISIBLE);
                viewHolder.icon2.setVisibility(View.VISIBLE);
                viewHolder.icon3.setVisibility(View.INVISIBLE);
                viewHolder.icon4.setVisibility(View.INVISIBLE);
                id1 = listBean.getPosts().get(0).getId();
                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id1);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
           // viewHolder.icon1.setVisibility(View.VISIBLE);
          Uri uri2=Uri.parse(listBean.getPosts().get(1).getPhoto().getUrl());
          viewHolder.icon2.setImageURI(uri2);
                id2 = listBean.getPosts().get(1).getId();

                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id2);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
         // viewHolder.icon2.setVisibility(View.VISIBLE);
        }
      else if(listBean.getPosts().size()==3){
          Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
          viewHolder.icon1.setImageURI(uri1);
                viewHolder.icon1.setVisibility(View.VISIBLE);
                viewHolder.icon2.setVisibility(View.VISIBLE);
                viewHolder.icon3.setVisibility(View.VISIBLE);
                viewHolder.icon4.setVisibility(View.INVISIBLE);
                id1 = listBean.getPosts().get(0).getId();
                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id1);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
          //viewHolder.icon1.setVisibility(View.VISIBLE);
          Uri uri2=Uri.parse(listBean.getPosts().get(1).getPhoto().getUrl());
          viewHolder.icon2.setImageURI(uri2);
                id2 = listBean.getPosts().get(1).getId();
                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id2);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
         // viewHolder.icon2.setVisibility(View.VISIBLE);
          Uri uri3=Uri.parse(listBean.getPosts().get(2).getPhoto().getUrl());
          viewHolder.icon3.setImageURI(uri3);
                id3 = listBean.getPosts().get(2).getId();
                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id3);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
          //viewHolder.icon3.setVisibility(View.VISIBLE);
      }
      else {
          Uri uri1=Uri.parse(listBean.getPosts().get(0).getPhoto().getUrl());
          viewHolder.icon1.setImageURI(uri1);
                viewHolder.icon1.setVisibility(View.VISIBLE);
                viewHolder.icon2.setVisibility(View.VISIBLE);
                viewHolder.icon3.setVisibility(View.VISIBLE);
                viewHolder.icon4.setVisibility(View.VISIBLE);
                id1 = listBean.getPosts().get(0).getId();
                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id1);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
          //viewHolder.icon1.setVisibility(View.VISIBLE);
          Uri uri2=Uri.parse(listBean.getPosts().get(1).getPhoto().getUrl());
          viewHolder.icon2.setImageURI(uri2);
                id2 = listBean.getPosts().get(1).getId();
                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id2);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
          // viewHolder.icon2.setVisibility(View.VISIBLE);
          Uri uri3=Uri.parse(listBean.getPosts().get(2).getPhoto().getUrl());
          viewHolder.icon3.setImageURI(uri3);
                id3 = listBean.getPosts().get(2).getId();
                if (listBean!=null) {
                    if (listBean.getTeacher() != null) {
                        if (listBean.getTeacher().getAvatar() != null) {
                            img = listBean.getTeacher().getAvatar();
                        }
                    }
                }
                viewHolder.icon3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context, StatusDetailsActivity.class);
                        intent.putExtra("id",id3);
                        intent.putExtra("img",img);
                        context.startActivity(intent);
                    }
                });
          //viewHolder.icon3.setVisibility(View.VISIBLE);
          Uri uri4=Uri.parse( "res://com.example.administrator.burning/"+R.mipmap.more);
          viewHolder.icon4.setImageURI(uri4);
                viewHolder.icon4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        context.startActivity(new Intent(context, Past_ItemActivity.class));
                    }
                });
      }
      //控件设置点击事件
       viewHolder.collecttion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(!iscollection){
                   viewHolder.collecttion.setImageResource(R.mipmap.collection_select_icon);
                   iscollection=true;
               }
               else{
                   viewHolder.collecttion.setImageResource(R.mipmap.groupstart);
                   iscollection=false;
               }

           }
       });
        viewHolder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Past_ItemActivity.class);
                String id = data.get(position).getId();
                intent.putExtra("id",id);

                context.startActivity(intent);
            }
        });

        return convertView;
    }




    }

    class ViewHolder{
        SimpleDraweeView icon,icon1,icon2,icon3,icon4;
        ImageView collecttion;
        TextView tv1_name,tv3_author,tv4_location,tv5_time;
        LinearLayout layout;

        public ViewHolder(View view) {
            collecttion= (ImageView) view.findViewById(R.id.action_past_layout1_icon_collect);
            icon= (SimpleDraweeView) view.findViewById(R.id.action_past_iv_id);
            icon1= (SimpleDraweeView) view.findViewById(R.id.action_past_layout5_iv1_id);
            icon2= (SimpleDraweeView) view.findViewById(R.id.action_past_layout5_iv2_id);
            icon3= (SimpleDraweeView) view.findViewById(R.id.action_past_layout5_iv3_id);
            icon4= (SimpleDraweeView) view.findViewById(R.id.action_past_layout5_iv4_id);
            tv1_name= (TextView) view.findViewById(R.id.action_past_layout1_tv_name);
            tv3_author= (TextView) view.findViewById(R.id.action_past_layout2_tv_author);
            tv4_location= (TextView) view.findViewById(R.id.action_past_layout3_tv_location);
            tv5_time= (TextView) view.findViewById(R.id.action_past_layout3_tv_time);
            layout= (LinearLayout) view.findViewById(R.id.past_first_linearlayout);
        }
    }


