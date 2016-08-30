package com.zyf.juheinquire.util;

import com.zyf.juheinquire.api.JuHeApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zyf on 16/8/30.
 */

public class NetWorkUtils {

    private static JuHeApiService apiService;

    private static void getRetrofitServices() {
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofit retrofit = builder.addConverterFactory(GsonConverterFactory.create()).baseUrl("http://v.juhe.cn").build();
        apiService = retrofit.create(JuHeApiService.class);
    }

    public static JuHeApiService getApiService() {
        if (apiService == null) {
            synchronized (NetWorkUtils.class) {
                if (apiService == null) {
                    getRetrofitServices();
                }
            }
        }
        return apiService;
    }
}
