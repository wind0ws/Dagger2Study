package com.threshold.dagger2study.module;

import com.threshold.dagger2study.utils.CrashHandlerUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CrashModule {

    @Singleton
    @Provides
    public CrashHandlerUtil provideCrashHandlerUtil() {
        return CrashHandlerUtil.getInstance();
    }

}
