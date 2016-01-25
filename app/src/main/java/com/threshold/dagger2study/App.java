package com.threshold.dagger2study;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.threshold.dagger2study.component.AppComponent;
import com.threshold.dagger2study.component.DaggerAppComponent;
import com.threshold.dagger2study.component.UserComponent;
import com.threshold.dagger2study.model.data.User;
import com.threshold.dagger2study.module.AppModule;
import com.threshold.dagger2study.module.UserModule;
import com.threshold.dagger2study.utils.CrashHandlerUtil;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Created by Threshold on 2016/1/18.
 */
public class App extends Application {

    private static final String TAG = "App";

    AppComponent mAppComponent;

    UserComponent mUserComponent;

    @Inject
    Lazy<CrashHandlerUtil> mCrashHandlerUtilLazy;

    @Inject
    User mUser;

    @Override
    public void onCreate() {
        super.onCreate();
        setUpAppComponent();
        initCrashUtil();
    }

    private void initCrashUtil() {
        Log.d(TAG, "mCrashHandlerUtilLazy!=null" + String.valueOf(mCrashHandlerUtilLazy != null));
        if (!BuildConfig.DEBUG) {
            mCrashHandlerUtilLazy.get().init(this);
            Log.d(TAG, "mCrashHandlerUtil初始化完毕");
        }
    }

    private void setUpAppComponent() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        // mAppComponent.inject(this);
        mUserComponent = mAppComponent.createUserComponent(new UserModule());
        mUserComponent.inject(this);//App can only be inject once!!! You can't declare inject both on AppComponent and UserComponent
        Log.d(TAG, "mUser!=null ??" + String.valueOf(mUser != null));
    }

    public UserComponent getUserComponent() {
        return mAppComponent.createUserComponent(new UserModule());
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public static App getInstance(Context context) {
        return (App)context.getApplicationContext();
    }



}
