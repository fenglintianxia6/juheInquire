package com.zyf.juheinquire.mvp.presenter;

import android.content.Context;

import com.zyf.juheinquire.api.JuHeApiService;
import com.zyf.juheinquire.application.JuHeApplication;
import com.zyf.juheinquire.mvp.QueryExpCompany;
import com.zyf.juheinquire.mvp.model.ExpCompanyInfo;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by zyf on 16/5/20.
 */
public class QueryCompanyPrensenter implements QueryExpCompany.Presenter {

    private Context context;

    @Inject
    JuHeApiService mService;

    public QueryCompanyPrensenter(Context context) {
        this.context = context;
        JuHeApplication.from(context).getComponent().inject(this);
    }


    @Override
    public void getCompanyList(final QueryExpCompany.View view) {
        view.onStartLoding();
        Call<ExpCompanyInfo> call = mService.getCompanyInfo();
        call.enqueue(new Callback<ExpCompanyInfo>() {
            @Override
            public void onResponse(Call<ExpCompanyInfo> call, Response<ExpCompanyInfo> response) {
                if (response.body() != null) {
                    view.onLodingFinish();
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
}
