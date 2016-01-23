package com.threshold.dagger2study;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.threshold.dagger2study.component.AppComponent;
import com.threshold.dagger2study.component.DaggerAppComponent;
import com.threshold.dagger2study.module.AppModule;
import com.threshold.dagger2study.utils.CrashHandlerUtil;

import javax.inject.Inject;

/**
 * Created by Threshold on 2016/1/18.
 */
public class App extends Application {

    private static final String TAG = "App";

    AppComponent mAppComponent;

    @Inject
    CrashHandlerUtil mCrashHandlerUtil;

    @Override
    public void onCreate() {
        super.onCreate();
        setUpAppComponent();
        initCrashUtil();
    }

    private void initCrashUtil() {
        if (!BuildConfig.DEBUG) {
            mCrashHandlerUtil.init(this);
            Log.d(TAG, "mCrashHandlerUtil初始化完毕");
        }
    }

    private void setUpAppComponent() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mAppComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public static App getInstance(Context context) {
        return (App)context.getApplicationContext();
    }

}
