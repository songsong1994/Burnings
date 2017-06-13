package com.example.administrator.burning.requestdata;

import com.example.administrator.burning.beans.History;
import com.example.administrator.burning.beans.TeacherEvents;

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
    @GET("events/history")
    Call<History> gethistory();
    //老师个人活动列表
    @GET("users/148ac21f187cdcbc/events")
    Call<TeacherEvents> getevents();
}
