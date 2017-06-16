package com.example.administrator.burning;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.burning.adapter.OrderUserRecycleAdapter;
import com.example.administrator.burning.beans.OrderEventDetail;
import com.example.administrator.burning.requestdata.APP;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//预约活动详情页面
public class OrderEventDetailActivity extends AppCompatActivity implements Callback<OrderEventDetail> {

    private SimpleDraweeView sdv;
    private OrderEventDetail.DataBean data;
    private TextView start_time_tv;
    private TextView enroll_num;
    private TextView topic;
    private TextView price;
    private SimpleDraweeView teacher_icon;
    private TextView teacher_name;
    private TextView address_name;
    private TextView hint;
    private TextView user_num;
    private TextView end_time;
    private RecyclerView sdv_user_rv;
    private ImageView sdv_user;
    private TextView photo_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_event_detail);
        Intent intent = getIntent();
        String path = intent.getStringExtra("id");
        init();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            sdv_user_rv.setLayoutManager(linearLayoutManager);
        }
        Fresco.initialize(this);
        APP app = (APP) this.getApplication();
        app.getServer().getDetail(path).enqueue(this);

    }
    public  void onClick(View v){
        switch (v.getId()){
            case R.id.order_event_detail_return:
                finish();
                break;
            case R.id.order_event_detail_address_detail:
                Toast.makeText(this,"跳转到baidu地图获取具体位置",Toast.LENGTH_LONG).show();
                break;
            case R.id.order_event_detail_enroll:
                Toast.makeText(this,"跳转到报名页面",Toast.LENGTH_LONG).show();
                break;
            case R.id.order_event_detail_follow:
                Toast.makeText(this,"关注成功",Toast.LENGTH_LONG).show();
                break;

        }
    }
    @Override
    public void onResponse(Call<OrderEventDetail> call, Response<OrderEventDetail> response) {
        data = response.body().getData();
        if (data.getPhoto() != null) {
            Uri uri=Uri.parse(data.getPhoto().getUrl().toString());
            sdv.setImageURI(uri);
        }
        if (data.getTeacher() != null) {
            Uri uri1=Uri.parse(data.getTeacher().getAvatar().toString());
            teacher_icon.setImageURI(uri1);
        }
        if (data.getStartTime() != null) {
            start_time_tv.setText(data.getStartTime());
        }
        enroll_num.setText("报名人数"+data.getSelledTicketCount()+"/"+data.getTicketCount());
        topic.setText(data.getTopic());
        photo_type.setText(data.getTopic());
        price.setText("￥"+data.getPrice());
        if (data.getTeacher() != null) {
            teacher_name.setText(data.getTeacher().getName());
        }
        if (data.getLocation() != null) {
            address_name.setText(data.getLocation().getName());
        }
        hint.setText(data.getBookingRequirement());
        user_num.setText(data.getSelledTicketCount()+"位燃伙伴已报名");
        String time=data.getEndTime();
        int num=time.indexOf(":");
        time.substring(num-2,num+3);
        end_time.setText(data.getStartTime().substring(0,data.getStartTime().lastIndexOf(":"))+"～"+time.substring(num-2,num+3));
        if (data.getBookedUsers() !=null) {
           sdv_user.setVisibility(View.GONE);
           sdv_user_rv.setVisibility(View.VISIBLE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
                sdv_user_rv.setAdapter(new OrderUserRecycleAdapter(data.getBookedUsers(),this));
            }

        }
    }
    @Override
    public void onFailure(Call<OrderEventDetail> call, Throwable t) {

        t.printStackTrace();
    }
    private void init() {
        sdv = (SimpleDraweeView) findViewById(R.id.order_event_detail_sdv);
        start_time_tv = (TextView) findViewById(R.id.order_event_detail_start_time);
        enroll_num = (TextView) findViewById(R.id.order_event_detail_enroll_num);
        topic = (TextView) findViewById(R.id.order_event_detail_topic);
        price = (TextView) findViewById(R.id.order_event_detail_price);
        teacher_icon = (SimpleDraweeView) findViewById(R.id.order_event_detail_teacher_icon);
        teacher_name = (TextView) findViewById(R.id.order_event_detail_teacher_name);
        address_name = (TextView) findViewById(R.id.order_event_detail_address_name);
        hint = (TextView) findViewById(R.id.order_event_detail_hint);
        user_num = (TextView) findViewById(R.id.order_event_detail_user_num);
        end_time = (TextView) findViewById(R.id.order_event_detail_end_time);
        sdv_user = (ImageView) findViewById(R.id.order_event_detail_user_icon);
        sdv_user_rv = (RecyclerView) findViewById(R.id.order_event_detail_user_icon_rv);
        photo_type = (TextView) findViewById(R.id.order_event_detail_photo_type);
    }
}
