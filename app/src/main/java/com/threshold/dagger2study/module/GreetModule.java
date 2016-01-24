package com.threshold.dagger2study.module;

import com.threshold.dagger2study.model.GreetManager;
import com.threshold.dagger2study.utils.ToastUtil;

import dagger.Module;
import dagger.Provides;

@Module
public class GreetModule {

    @Provides
    public GreetManager provideGreetManager(ToastUtil toastUtil) {
        return new GreetManager(toastUtil);
    }

}
