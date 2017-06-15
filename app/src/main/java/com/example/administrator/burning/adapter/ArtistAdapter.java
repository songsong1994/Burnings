package com.example.administrator.burning.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.TeacherEvents;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * 教师活动
 * Created by Administrator on 2017/6/12.
 */

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder> {
    private Context context;
    private List<TeacherEvents.DataBean.ListBean> list;
    public ArtistAdapter(Context context, List<TeacherEvents.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ArtistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_artist_layout,parent,false);
        ArtistViewHolder holder = new ArtistViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ArtistViewHolder holder, int position) {

        TeacherEvents.DataBean.ListBean bean = list.get(position);
        if (bean.getPhoto()!=null) {

            Uri uri = Uri.parse(bean.getPhoto().getUrl());
            holder.simpleDraweeView.setImageURI(uri);
        }
        holder.drawname.setText(bean.getTopic());
        if (bean.getTeacher()!=null) {
            holder.authorname.setText(bean.getTeacher().getName());
        }else {
            holder.authorname.setText("不详");
        }

        holder.date.setText(bean.getStartTime());
        if (bean.getLocation()!=null) {
            holder.site.setText(bean.getLocation().getName());
        }
        else
        {
            holder.site.setText("不详");
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ArtistViewHolder extends RecyclerView.ViewHolder{
        public SimpleDraweeView simpleDraweeView;
        public TextView drawname,authorname,date,site;
        public ArtistViewHolder(View itemView) {
            super(itemView);
            simpleDraweeView = (SimpleDraweeView) itemView.findViewById(R.id.artist_item_img);
            drawname = (TextView) itemView.findViewById(R.id.artist_item_drawname);
            authorname = (TextView) itemView.findViewById(R.id.artist_item_authorname);
            date = (TextView) itemView.findViewById(R.id.artist_item_date);
            site = (TextView) itemView.findViewById(R.id.artist_item_site);
        }
    }


}
