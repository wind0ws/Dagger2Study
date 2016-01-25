package com.threshold.dagger2study.module;

import android.content.Context;

import com.threshold.dagger2study.App;
import com.threshold.dagger2study.utils.ToastUtil;

import dagger.Module;
import dagger.Provides;

@Module
public class ToastModule {

    @Provides
    public ToastUtil provideToastUtil(Context context) {
        return new ToastUtil(context);
    }
}
