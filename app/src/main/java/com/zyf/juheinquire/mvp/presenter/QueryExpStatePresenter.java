package com.zyf.juheinquire.mvp.presenter;

import android.content.Context;

import com.zyf.juheinquire.api.JuHeApiService;
import com.zyf.juheinquire.application.Constant;
import com.zyf.juheinquire.application.JuHeApplication;
import com.zyf.juheinquire.mvp.QueryData;
import com.zyf.juheinquire.mvp.model.ExpStageInfo;
import com.zyf.juheinquire.util.ListUtils;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by zyf on 16/5/20.
 */
public class QueryExpStatePresenter implements QueryData.Presenter {

    private Context context;
    @Inject
    JuHeApiService mJuHeService;


    private String com;

    private String no;

    public QueryExpStatePresenter(Context context, String no) {
        this.context = context;
        this.no = no;
        JuHeApplication.from(context).getComponent().inject(this);
    }

    @Override
    public void getData(final QueryData.View view) {
        view.onStartLoding();
        Map<String, String> map = new HashMap<>();
        map.put("com", com);
        map.put("no", no);
        map.put("key", Constant.EXP_KEY);
        Call<ExpStageInfo> call = mJuHeService.getExpStateInfo(map);
        call.enqueue(new Callback<ExpStageInfo>() {
            @Override
            public void onResponse(Call<ExpStageInfo> call, Response<ExpStageInfo> response) {
                if (response.body() != null && !ListUtils.isEmpty(response.body().getResult().getList())) {
                    view.onLodingFinish(response.body().getResult().getList());
                } else {
                    view.onLogingFailed();
                }
            }

            @Override
            public void onFailure(Call<ExpStageInfo> call, Throwable t) {
                view.onLogingFailed();
            }
        });
    }

    @Override
    public void setData(Object o) {
        if (o instanceof String)
            this.com = (String) o;
    }


}
