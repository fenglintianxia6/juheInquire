package com.zyf.juheinquire.di;

import com.zyf.juheinquire.mvp.presenter.QueryCompanyPrensenter;
import com.zyf.juheinquire.mvp.presenter.QueryExpStatePresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zyf on 16/5/20.
 */
@Singleton
@Component(modules = ApplicationModel.class)
public interface ApplicationComponent {

    void inject(QueryCompanyPrensenter queryCompanyPrensenter);

    void inject(QueryExpStatePresenter queryExpStatePresenter);

}
