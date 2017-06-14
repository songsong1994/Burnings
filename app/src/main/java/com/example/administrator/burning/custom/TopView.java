package com.example.administrator.burning.custom;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.burning.Home_ListImg_Activity;
import com.example.administrator.burning.R;
import com.example.administrator.burning.adapter.TopPagerAdapter;
import com.example.administrator.burning.adapter.TopRecycleAdapter;
import com.example.administrator.burning.bean.Space;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/6/12.
 */

public class TopView extends FrameLayout implements Callback<Space>, ViewPager.OnPageChangeListener, View.OnClickListener {
    private  SimpleDraweeView recommend;
    private  TextView title;
    private  TextView subject;
    private  FrameLayout toList;
    private  RecyclerView recycler;
    private TopRecycleAdapter adapter;
    private Context context;
    private List<Space.DataBean.TeachersBean> data;
    //--------------------------------
    private  ViewPager pager;
    private  TopPagerAdapter adapterPager;
    private List<ImageView>imgs;
    private List<SimpleDraweeView> datas;
    private  LinearLayout radios;

    public TopView(@NonNull Context context) {
        super(context);
        this.context=context;
        Fresco.initialize(context);
        LayoutInflater.from(context).inflate(R.layout.top_view,this);
        init();
        //recyclerView填充数据
        data = new ArrayList<>();
        adapter = new TopRecycleAdapter(data,getContext());
        recycler.setAdapter(adapter);
        //-------------------------------------------
        datas = new ArrayList<>();
        imgs = new ArrayList<>();
        APP app = (APP) ((Activity) context).getApplication();
        app.getServer().getSpace().enqueue(this);
        pager.addOnPageChangeListener(this);
        toList.setOnClickListener(this);


    }

    private void init() {
        recycler = (RecyclerView) findViewById(R.id.recycle_top);
        pager = (ViewPager) findViewById(R.id.pager_top);
        radios = (LinearLayout) findViewById(R.id.radios);
        recommend = (SimpleDraweeView) findViewById(R.id.img_recommend);
        title = (TextView) findViewById(R.id.title_burning);
        subject = (TextView) findViewById(R.id.subject_burning);
        toList = (FrameLayout) findViewById(R.id.to_home_list);
    }

    @Override
    public void onResponse(Call<Space> call, Response<Space> response) {
        List<Space.DataBean.TeachersBean> teachers = response.body().getData().getTeachers();
        data.addAll(teachers);
        adapter.notifyDataSetChanged();
        List<Space.DataBean.BannersBean> banners = response.body().getData().getBanners();
        List<Space.DataBean.PostTopicsBean> postTopics = response.body().getData().getPostTopics();
        Space.DataBean.PostTopicsBean.PhotoBeanX photo = postTopics.get(1).getPhoto();
        Space.DataBean.PostTopicsBean postTopicsBean = postTopics.get(1);
        recommend.setImageURI(photo.getUrl());
        recommend.setAspectRatio(photo.getWidth()/photo.getHeight());
        title.setText(postTopicsBean.getTitle());
        subject.setText("-"+postTopicsBean.getSubtitle()+"-");
        for (Space.DataBean.BannersBean banner : banners) {
            SimpleDraweeView sdv = new SimpleDraweeView(context);
            sdv.setImageURI(banner.getPhoto().getUrl());
            sdv.setAspectRatio(banner.getPhoto().getWidth()/banner.getPhoto().getHeight());
            datas.add(sdv);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.gray_point);
            imageView.setPadding(5,0,5,0);
            radios.addView(imageView);
            imgs.add(imageView);
        }
        ((ImageView) radios.getChildAt(0)).setImageResource(R.drawable.rad_point);
//        adapterPager.addAll(datas);

        adapterPager = new TopPagerAdapter(context,datas);
        pager.setAdapter(adapterPager);
    }

    @Override
    public void onFailure(Call<Space> call, Throwable t) {
        t.printStackTrace();
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        for (ImageView img : imgs) {
            img.setImageResource(R.drawable.gray_point);
        }
        imgs.get(position).setImageResource(R.drawable.rad_point);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
        context.startActivity(new Intent(context, Home_ListImg_Activity.class));
    }
}
