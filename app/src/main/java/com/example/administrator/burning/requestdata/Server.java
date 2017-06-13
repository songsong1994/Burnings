package com.example.administrator.burning.requestdata;

import com.example.administrator.burning.bean.Space;
import com.example.administrator.burning.beans.History;
import com.example.administrator.burning.beans.TeacherEvents;
import com.example.administrator.burning.beans.TeacherIntroduce;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * 请求数据的网址
 * Created by Administrator on 2017/6/12.
 */

public interface Server {
    //测试类
    @GET("events/booking")
    Call<Top> getdata();

    //往期
    @GET("events/history?eetpn=3")
    Call<History> gethistory();

    @GET("users/148ac21f187cdcbc/info")
    Call<TeacherIntroduce> getintroduce();

    //教师个人页面
    @GET("users/148ac21f187cdcbc/events")
    Call<TeacherEvents> getevents();

    @GET("home")
    Call<Space>getSpace();
}
