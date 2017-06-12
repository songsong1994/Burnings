package com.example.administrator.burning;

import java.io.IOException;
import java.nio.charset.Charset;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * 拦截器，别修改
 * Created by Administrator on 2017/6/12.
 */

public class HttpInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request().newBuilder().addHeader("rpc-key", "ovvTH9HICcdb6K9I").addHeader("Authorization", "ZjBkODBiNzAxY2MyNDE0MWEzMzVkNmE4YjBhYzU0NDI6MTg2MTI3OTIxMTA6MToxNzIyOjFjYmViM2Y0MjEyM2ZhOGVkOGRjMzc3OWYzOTJmYzU2").build();
        Response response = chain.proceed(request);
        return response;
    }
}
