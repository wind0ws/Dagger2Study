package com.threshold.dagger2study.module;

import com.threshold.dagger2study.annotation.ActivityScope;
import com.threshold.dagger2study.annotation.Named;
import com.threshold.dagger2study.model.HelloManager;
import com.threshold.dagger2study.utils.ToastUtil;


import dagger.Module;
import dagger.Provides;


@Module
public class HelloModule {

    @Provides
    @ActivityScope
    public HelloManager provideHello(ToastUtil toastUtil) {
        return new HelloManager(toastUtil, "English");
    }

//    @ActivityScope
//  //  @Named("Chinese")
//    @Provides
//    public HelloManager provideNiHao(ToastUtil toastUtil) {
//        return new HelloManager(toastUtil, "Chinese");
//    }


}
