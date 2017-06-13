package com.example.administrator.burning.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.burning.R;
import com.example.administrator.burning.beans.History;

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
        viewHolder.tv1_name.setText(listBean.getTopic());
        viewHolder.tv3_author.setText(listBean.getTeacher().getName());
        viewHolder.tv4_location.setText(listBean.getLocation().getName());
        viewHolder.tv5_time.setText(listBean.getStartTime());

        return convertView;
    }
    class ViewHolder{
        ImageView icon;
        TextView tv1_name,tv3_author,tv4_location,tv5_time;
        LinearLayout layout;

        public ViewHolder(View view) {
            icon= (ImageView) view.findViewById(R.id.action_past_iv_id);
            tv1_name= (TextView) view.findViewById(R.id.action_past_layout1_tv_name);
            tv3_author= (TextView) view.findViewById(R.id.action_past_layout2_tv_author);
            tv4_location= (TextView) view.findViewById(R.id.action_past_layout3_tv_location);
            tv5_time= (TextView) view.findViewById(R.id.action_past_layout3_tv_time);
            layout= (LinearLayout) view.findViewById(R.id.action_past_layout4);
        }
    }
}
