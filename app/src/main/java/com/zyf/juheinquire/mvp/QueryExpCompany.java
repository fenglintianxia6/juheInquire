package com.zyf.juheinquire.mvp;

import com.zyf.juheinquire.mvp.presenter.BasePresent;
import com.zyf.juheinquire.mvp.view.BaseView;

/**
 * Created by zyf on 16/5/20.
 */
public interface QueryExpCompany {


    interface View extends BaseView<QueryExpCompany.Presenter> {
        void onStartLoding();

        void onLodingFinish();

        void onLogingFailed();
    }


    interface Presenter extends BasePresent {
        void getCompanyList(View view);
    }
}
