package com.example.administrator.burning.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.TecherStatus;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/14.
 */

public class ArtistStatusAdapter extends RecyclerView.Adapter<ArtistStatusAdapter.statusViewHolder>{
    private Context context;
    private List<TecherStatus.DataBean.ListBean> list;
    private String img;
    public ArtistStatusAdapter(Context context, List<TecherStatus.DataBean.ListBean> list,String img) {
        this.context = context;
        this.list = list;
        this.img = img;
    }

    @Override
    public statusViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.artist_recycler_item,parent,false);
        statusViewHolder holder = new statusViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(statusViewHolder holder, int position) {
        TecherStatus.DataBean.ListBean bean = list.get(position);
        Uri uri = Uri.parse(img);
        holder.img.setImageURI(uri);
        if (bean.getPhoto() != null) {
            Uri uri1 = Uri.parse(bean.getPhoto().getUrl());
            holder.bigimg.setImageURI(uri1);
        }
        if (bean.getUser() != null) {
            holder.name.setText(bean.getUser().getName());
        }
        String time=bean.getCreated();
        StringBuffer buffer = new StringBuffer(time);
        StringBuffer delete = buffer.delete(0, 5);
        StringBuffer delete1 = delete.delete(11, 14);
        holder.date.setText(delete1.toString());
        holder.liked.setText(bean.getLikeNum()+"");
        holder.mark.setText(bean.getMarkNum()+"");
        holder.comment.setText(bean.getCommentNum() + "");
        if (bean.getContent()==null) {
            holder.body.setText("#无");
        }else {
            holder.body.setText(bean.getContent());
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class statusViewHolder extends RecyclerView.ViewHolder{
        private SimpleDraweeView img,bigimg;
        private TextView name,date,body,liked,mark,comment;
        public statusViewHolder(View itemView) {
            super(itemView);
            body = (TextView) itemView.findViewById(R.id.artist_rec_body);
            img = (SimpleDraweeView) itemView.findViewById(R.id.artist_rec_simple);
            bigimg = (SimpleDraweeView) itemView.findViewById(R.id.artist_rec_simplebig);
            name = (TextView) itemView.findViewById(R.id.artist_rec_name);
            date = (TextView) itemView.findViewById(R.id.artist_rec_time);
            liked = (TextView) itemView.findViewById(R.id.artist_rec_liked);
            mark = (TextView) itemView.findViewById(R.id.artist_rec_mark);
            comment = (TextView) itemView.findViewById(R.id.artist_rec_comment);
        }
    }
}
