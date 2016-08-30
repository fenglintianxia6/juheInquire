package com.zyf.juheinquire.application;

import android.app.Application;

import com.thinkland.sdk.android.JuheSDKInitializer;

/**
 * Created by zyf on 16/5/19.
 */
public class JuHeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JuheSDKInitializer.initialize(getApplicationContext());
    }


}
