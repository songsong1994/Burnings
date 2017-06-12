package com.example.administrator.burning.requestdata;

import android.app.Application;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/6/12.
 */

public class APP extends Application {
    private Server server;

    @Override
    public void onCreate() {
        super.onCreate();
        //设置拦截器
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new HttpInterceptor());
        server = new Retrofit.Builder()
                .baseUrl("http://dev.artful.com.cn/api/artful/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build()
                .create(Server.class);

    }

    public Server getServer() {
        return server;
    }

}
