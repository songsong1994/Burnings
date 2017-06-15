
package com.example.administrator.burning.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.burning.ArtistActivity;
import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.TeacherList;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * 教师列表
 * Created by Administrator on 2017/6/14.
 */

public class ArtistListAdapter extends RecyclerView.Adapter<ArtistListAdapter.artistListViewHolder> implements View.OnClickListener {
    private Context context;
    private List<TeacherList.DataBean.ListBean> list;
    private RecyclerView recyclerView;
    public ArtistListAdapter(Context context, List<TeacherList.DataBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public artistListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.artistlist_item,parent,false);
        view.setOnClickListener(this);
        View img = view.findViewById(R.id.artist_list_img);
        img.setAlpha(0.6f);
        artistListViewHolder holder = new artistListViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(artistListViewHolder holder, int position) {
        TeacherList.DataBean.ListBean listBean = list.get(position);
        if (listBean.getAvatar() != null) {
            Uri uri = Uri.parse(listBean.getAvatar());
            holder.img.setImageURI(uri);
        }
        holder.tv.setText(listBean.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View v) {
        int position = recyclerView.getChildAdapterPosition(v);
        String id = list.get(position).getId();
        Intent intent = new Intent(context, ArtistActivity.class);
        intent.putExtra("userId",id);
        context.startActivity(intent);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;

    }


    public class artistListViewHolder extends RecyclerView.ViewHolder{
        private SimpleDraweeView img;
        private TextView tv;
        public artistListViewHolder(View itemView) {
            super(itemView);
            img = (SimpleDraweeView) itemView.findViewById(R.id.artist_list_simple);
            tv = (TextView) itemView.findViewById(R.id.artist_list_tv);
        }
    }
}
