package com.zyf.juheinquire.application;

import android.app.Application;
import android.content.Context;

import com.thinkland.sdk.android.JuheSDKInitializer;
import com.zyf.juheinquire.di.ApplicationComponent;
import com.zyf.juheinquire.di.DaggerApplicationComponent;

/**
 * Created by zyf on 16/5/19.
 */
public class JuHeApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder().build();
        JuheSDKInitializer.initialize(getApplicationContext());
    }

    public static JuHeApplication from(Context context) {
        return (JuHeApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
