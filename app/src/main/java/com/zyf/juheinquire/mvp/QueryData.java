package com.zyf.juheinquire.mvp;

import com.zyf.juheinquire.mvp.presenter.BasePresent;
import com.zyf.juheinquire.mvp.view.BaseView;

/**
 * Created by zyf on 16/5/20.
 */
public interface QueryData {


    interface View<T> extends BaseView<QueryData.Presenter> {
        void onStartLoding();

        void onLodingFinish(T t);

        void onLogingFailed();
    }


    interface Presenter<T> extends BasePresent {
        void getData(View view);

        /**
         * 用于在View 和Presenter 之间传递数据
         *
         * @param t
         */
        void setData(T t);
    }
}
