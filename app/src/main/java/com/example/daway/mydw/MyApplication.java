package com.example.daway.mydw;

import android.app.Application;

import com.lzy.okgo.OkGo;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by Daway on 2017/10/12.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initOkGO();
    }
private void initOkGO()
{
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
    //全局的读取超时时间
    builder.readTimeout(10000, TimeUnit.MILLISECONDS);
//全局的写入超时时间
    builder.writeTimeout(10000, TimeUnit.MILLISECONDS);
//全局的连接超时时间
    builder.connectTimeout(10000, TimeUnit.MILLISECONDS);
    OkGo.getInstance().init(this)                       //必须调用初始化
            .setOkHttpClient(builder.build())               //建议设置OkHttpClient，不设置将使用默认的
            .setRetryCount(3);
}

}
