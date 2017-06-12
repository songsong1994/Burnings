package com.example.administrator.burning.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.burning.R;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.HomeViewHolder> {

    private List<String> data;
    private Context context;
    private TextView text;

    public RecycleAdapter(List<String> data, Context context) {
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
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        holder.text.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public HomeViewHolder(View itemView) {
            super(itemView);
            text = ((TextView) itemView.findViewById(R.id.tv));
        }
    }
}
