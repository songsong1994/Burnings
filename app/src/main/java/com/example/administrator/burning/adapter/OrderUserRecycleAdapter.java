package com.example.administrator.burning.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.OrderEventDetail;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by WeihuaWang on 2017/6/15.
 */

public class OrderUserRecycleAdapter extends RecyclerView.Adapter<OrderUserRecycleAdapter.ViewHolder> {
    private List<OrderEventDetail.DataBean.BookedUsersBean> date;
    private Context context;

    public OrderUserRecycleAdapter(List<OrderEventDetail.DataBean.BookedUsersBean> date, Context context) {
        this.date = date;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_order_user_layout,null,false);
       ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Uri uri=Uri.parse(date.get(position).getAvatar());
       holder.iv.setImageURI(uri);


    }

    @Override
    public int getItemCount() {
        return date.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder {

        SimpleDraweeView iv;

        public ViewHolder(View itemView) {
            super(itemView);
            iv= (SimpleDraweeView) itemView.findViewById(R.id.item_order_user_sdv);
        }
    }
}
