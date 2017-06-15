package com.example.administrator.burning.requestdata;

import com.example.administrator.burning.bean.Space;
import com.example.administrator.burning.beans.History;
import com.example.administrator.burning.beans.HistoryBetails;
import com.example.administrator.burning.beans.OrderEvent;
import com.example.administrator.burning.beans.OrderEventDetail;
import com.example.administrator.burning.beans.TeacherArtifact;
import com.example.administrator.burning.beans.TeacherArtifactDetails;
import com.example.administrator.burning.beans.TeacherDetails;
import com.example.administrator.burning.beans.TeacherEvents;
import com.example.administrator.burning.beans.TeacherIntroduce;
import com.example.administrator.burning.beans.TeacherList;
import com.example.administrator.burning.beans.TecherStatus;
import com.example.administrator.burning.beans.TecherStatusDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

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

    //教师个人信息
    @GET("users/{userId}/info")
    Call<TeacherIntroduce> getintroduce(@Path("userId") String userId);

    //教师活动
    @GET("users/{userId}/events")
    Call<TeacherEvents> getevents(@Path("userId") String userId);

    //教师时刻
    @GET("users/{userId}/statuses")
    Call<TecherStatus> getstatus(@Path("userId") String userId);
    @GET("statuses/{id}")
    Call<TecherStatusDetails> getstatusDetails(@Path("id") String id);
    //艺术家列表
    @GET("teachers")
    Call<TeacherList> getlist(@Query("page") int id);
    //教师详情
    @GET("teachers/{userId}/intro")
    Call<TeacherDetails> getdetails(@Path("userId") String userId);
    //教师作品
    @GET("users/{userId}/artifacts")
    Call<TeacherArtifact> getartifact(@Path("userId") String userId);
    //教师作品详情
    @GET("artifacts/{id}")
    Call<TeacherArtifactDetails> getartifactDetails(@Path("id") String id);
    //往期详情
    @GET("events/{id}")
    Call<HistoryBetails> getbetails(@Path("id") String id);
    @GET("home")
    Call<Space>getSpace();
    //最新活动列表
    @GET ("events/booking")
    Call<OrderEvent> getOrderEvent();
    //最新活动列表详情
    @GET ("events/{string}/booking_detail")
    Call<OrderEventDetail> getDetail(@Path("string") String string);
}
