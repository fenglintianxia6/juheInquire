package com.zyf.juheinquire.di;

import com.zyf.juheinquire.api.JuHeApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zyf on 16/5/20.
 */
@Module
public class ApplicationModel {

    private JuHeApiService mJuHeService;

    public ApplicationModel() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://v.juhe.cn").addConverterFactory(GsonConverterFactory.create()).build();
        mJuHeService = retrofit.create(JuHeApiService.class);
    }

    @Singleton
    @Provides
    JuHeApiService provideJuHeApi() {
        return mJuHeService;
    }

}
