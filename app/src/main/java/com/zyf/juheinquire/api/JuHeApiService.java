package com.zyf.juheinquire.api;

import com.zyf.juheinquire.mvp.model.ExpCompanyInfo;
import com.zyf.juheinquire.mvp.model.ExpStageInfo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zyf on 16/5/20.
 */
public interface JuHeApiService {

    @GET("exp/com")
    Call<ExpCompanyInfo> getCompanyInfo();


    @GET("exp/index")
    Call<ExpStageInfo> getExpStateInfo();

}
