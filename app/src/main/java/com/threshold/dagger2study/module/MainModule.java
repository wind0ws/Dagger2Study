package com.threshold.dagger2study.module;

import com.threshold.dagger2study.annotation.ActivityScope;
import com.threshold.dagger2study.presenter.MainPresenterImpl;
import com.threshold.dagger2study.presenter.interfaces.MainPresenter;
import com.threshold.dagger2study.ui.interfaces.MainView;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private MainView mainView;

    public MainModule(MainView mainView) {
        this.mainView = mainView;
    }

    @Provides
    @ActivityScope
    public MainView provideMainView() {
        return mainView;
    }

    @Provides
    @ActivityScope
    public MainPresenter provideMainPresenter(MainView mainView) {
        return new MainPresenterImpl(mainView);
    }




}
