package com.threshold.dagger2study.module;


import android.content.Context;

import com.threshold.dagger2study.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Singleton
    @Provides
    public App provideApp() {
        return app;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return app;
    }


}
