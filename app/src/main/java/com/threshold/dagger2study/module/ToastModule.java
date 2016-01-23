package com.threshold.dagger2study.module;

import com.threshold.dagger2study.App;
import com.threshold.dagger2study.utils.ToastUtil;

import dagger.Module;
import dagger.Provides;

@Module
public class ToastModule {

    @Provides
    public ToastUtil provideToastUtil(App application) {
        return new ToastUtil(application);
    }
}
