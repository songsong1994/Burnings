package com.example.administrator.burning.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.burning.ArtifactDetailsActivity;
import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.TeacherArtifact;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * 教师作品
 * Created by Administrator on 2017/6/14.
 */

public class ArtistArtifactAdapter extends RecyclerView.Adapter<ArtistArtifactAdapter.artifactViewHolder> implements View.OnClickListener {
    private Context context;
    private List<TeacherArtifact.DataBean.ListBean> list;
    private String img1;
    private RecyclerView recyclerView;
    public ArtistArtifactAdapter(Context context, List<TeacherArtifact.DataBean.ListBean> list, String img) {
        this.context = context;
        this.list = list;
        this.img1 = img;
    }

    @Override
    public artifactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.artist_artifact_item,parent,false);
        view.setOnClickListener(this);
        artifactViewHolder holder = new artifactViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(artifactViewHolder holder, int position) {
        TeacherArtifact.DataBean.ListBean bean = list.get(position);
        if (img1 != null) {
            Uri uri = Uri.parse(img1);
            holder.img.setImageURI(uri);
        }
        if (bean.getPhoto() != null) {
            Uri uri1 = Uri.parse(bean.getPhoto().getUrl());
            holder.bigimg.setImageURI(uri1);
        }
        if (bean.getUser() != null) {
            holder.name.setText(bean.getUser().getName());
        }
        if (bean.getCreated() != null) {
            holder.date.setText(bean.getCreated());
        }
        holder.mark.setText(bean.getMarkNum()+"");
        if (bean.getArtifactDate() != null) {
            String time=bean.getArtifactDate();
            StringBuffer buffer = new StringBuffer(time);
            StringBuffer delete = buffer.delete(11, 16);
            holder.time.setText(delete.toString());
        }
        if (bean.getArtifactSize() != null) {
            holder.size.setText(bean.getArtifactSize());
        }
        if (bean.getArtifactName() != null) {
            String name = bean.getArtifactName();
            String right = name.substring(0,1);
            String left  = name.substring(name.length()-1,name.length());
            if(right.equals("《") || left.equals("》")) {
                holder.left1.setText("");
                holder.right1.setText("");
                holder.body.setText(bean.getArtifactName());
            }else {
                holder.body.setText(bean.getArtifactName());
            }
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View v) {
        int positing = recyclerView.getChildAdapterPosition(v);
        String id = list.get(positing).getId();
        Intent intent = new Intent(context, ArtifactDetailsActivity.class);
        intent.putExtra("id",id);
        intent.putExtra("img",img1);
        context.startActivity(intent);
    }

    public class artifactViewHolder extends RecyclerView.ViewHolder{
        private SimpleDraweeView img,bigimg;
        private TextView name,date,body,time,mark,size,right1,left1;
        public artifactViewHolder(View itemView) {
            super(itemView);
            body = (TextView) itemView.findViewById(R.id.artifact_rec_body);
            img = (SimpleDraweeView) itemView.findViewById(R.id.artifact_rec_simple);
            bigimg = (SimpleDraweeView) itemView.findViewById(R.id.artifact_rec_simplebig);
            name = (TextView) itemView.findViewById(R.id.artifact_rec_name);
            date = (TextView) itemView.findViewById(R.id.artifact_rec_time);
            time = (TextView) itemView.findViewById(R.id.artifact_time_date);
            mark = (TextView) itemView.findViewById(R.id.artifact_rec_mark);
            size = (TextView) itemView.findViewById(R.id.artifact_size);
            right1 = (TextView) itemView.findViewById(R.id.artist_artifact_right);
            left1  = (TextView) itemView.findViewById(R.id.artist_artifact_left);

        }
    }
}
