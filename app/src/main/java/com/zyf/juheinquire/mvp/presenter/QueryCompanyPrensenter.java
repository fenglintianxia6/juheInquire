package com.zyf.juheinquire.mvp.presenter;

import android.content.Context;

import com.zyf.juheinquire.api.JuHeApiService;
import com.zyf.juheinquire.application.Constant;
import com.zyf.juheinquire.mvp.QueryData;
import com.zyf.juheinquire.mvp.model.ExpCompanyInfo;
import com.zyf.juheinquire.util.ListUtils;
import com.zyf.juheinquire.util.NetWorkUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by zyf on 16/5/20.
 */
public class QueryCompanyPrensenter implements QueryData.Presenter {

    private Context context;

    private JuHeApiService mService;

    public QueryCompanyPrensenter(Context context) {
        this.context = context;
        mService = NetWorkUtils.getApiService();
    }


    @Override
    public void getData(final QueryData.View view) {
        view.onStartLoding();
        Call<ExpCompanyInfo> call = mService.getCompanyInfo(Constant.EXP_KEY);
        call.enqueue(new Callback<ExpCompanyInfo>() {
            @Override
            public void onResponse(Call<ExpCompanyInfo> call, Response<ExpCompanyInfo> response) {
                if (response.body() != null && !ListUtils.isEmpty(response.body().getResult())) {
                    view.onLodingFinish(response.body());
                } else {
                    view.onLogingFailed();
                }
            }

            @Override
            public void onFailure(Call<ExpCompanyInfo> call, Throwable t) {
                view.onLogingFailed();
            }
        });
    }


    @Override
    public void setData(Object o) {

    }
}
