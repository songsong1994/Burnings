package com.example.administrator.burning.requestdata;

import com.example.administrator.burning.bean.Space;
import com.example.administrator.burning.beans.History;
import com.example.administrator.burning.beans.TeacherEvents;
import com.example.administrator.burning.beans.TeacherIntroduce;
import com.example.administrator.burning.beans.TecherStatus;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

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

    //教师个人详情
    @GET("users/{userId}/info")
    Call<TeacherIntroduce> getintroduce(@Path("userId") String userId);

    //教师个人页面
    @GET("users/{userId}/events")
    Call<TeacherEvents> getevents(@Path("userId") String userId);

    //时刻
    @GET("users/{userId}/statuses")
    Call<TecherStatus> getstatus(@Path("userId") String userId);

    @GET("home")
    Call<Space>getSpace();
}
