package com.example.administrator.burning.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.History;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */

public class Past_itemActivity_itemAdapter extends RecyclerView.Adapter<Past_itemActivity_itemAdapter.ViewHolder>{

    private List<History.DataBean.ListBean.PostsBean> data;
    private Context context;

    public Past_itemActivity_itemAdapter(List<History.DataBean.ListBean.PostsBean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_past_itemactivity, null, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Uri uri=Uri.parse(data.get(position).getPhoto().getUrl());
        holder.image.setImageURI(uri);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private SimpleDraweeView image;

        public ViewHolder(View itemView) {
            super(itemView);
            image= (SimpleDraweeView) itemView.findViewById(R.id.past_itemactivity_item_icon);
        }
    }
}
