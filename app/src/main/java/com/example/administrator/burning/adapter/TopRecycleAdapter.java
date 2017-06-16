package com.example.administrator.burning.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.burning.ArtistActivity;
import com.example.administrator.burning.R;
import com.example.administrator.burning.bean.Space;
import com.facebook.drawee.view.SimpleDraweeView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */

public class TopRecycleAdapter extends RecyclerView.Adapter<TopRecycleAdapter.HomeViewHolder>  {

    private List<Space.DataBean.TeachersBean> data;
    private Context context;


    public TopRecycleAdapter(List<Space.DataBean.TeachersBean> data, Context context) {
        this.data = data;
        this.context = context;

    }

    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item_home,parent,false);
        HomeViewHolder holder = new HomeViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, final int position) {


        holder.recyclerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ArtistActivity.class);
                String ids = data.get(position).getId();
                intent.putExtra("userId",ids);
                context.startActivity(intent);
            }
        });
        List<Space.DataBean.Artifact> artifacts = data.get(position).getArtifacts();
        holder.draweeView.setImageURI(data.get(position).getAvatar());
        for (int i = 0; i < 3; i++) {
            ((SimpleDraweeView) holder.sdv_layout.getChildAt(i)).setAspectRatio(1);
        }
        int i=0;
        for (Space.DataBean.Artifact artifact : artifacts) {
            SimpleDraweeView sdv=(SimpleDraweeView) holder.sdv_layout.getChildAt(i);
            Log.i("info", "onBindViewHolder: ------------->"+artifact.getPhoto().getUrl());
            sdv.setImageURI(artifact.getPhoto().getUrl());
            i++;
        }
        Space.DataBean.TeachersBean bean = data.get(position);
        if (data.get(position).getName()!=null) {
            holder.name.setText(bean.getName().toString());
        }else {
            holder.name.setText("默认用户名");
        }
        holder.folloNum.setText("粉丝:"+bean.getFollowerNum());
        holder.eventNum.setText("活动:"+bean.getEventNum());
        if (bean.getSign()==null){

            holder.sign.setText("暂无介绍");
        }else {
            holder.sign.setText(bean.getSign().toString());
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    public class HomeViewHolder extends RecyclerView.ViewHolder {
        public SimpleDraweeView draweeView;
        public TextView name;
        public TextView folloNum;
        public TextView eventNum;
        public TextView sign;
        public LinearLayout sdv_layout;
        public LinearLayout recyclerLayout;
        public HomeViewHolder(View v) {
            super(v);
            draweeView= (SimpleDraweeView) v.findViewById(R.id.avatar);
            name = (TextView) v.findViewById(R.id.name);
            folloNum = (TextView) v.findViewById(R.id.followNum);
            eventNum = (TextView) v.findViewById(R.id.eventNum);
            sign = (TextView) v.findViewById(R.id.sign);
            sdv_layout = (LinearLayout) v.findViewById(R.id.sdv_layout);
            recyclerLayout = (LinearLayout) v.findViewById(R.id.recycle_layout);
        }
    }
}
