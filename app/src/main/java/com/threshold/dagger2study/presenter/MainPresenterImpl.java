package com.threshold.dagger2study.presenter;

import com.threshold.dagger2study.annotation.ActivityScope;
import com.threshold.dagger2study.presenter.interfaces.MainPresenter;
import com.threshold.dagger2study.ui.interfaces.MainView;


@ActivityScope
public class MainPresenterImpl implements MainPresenter {

    private MainView mMainView;

    public MainPresenterImpl(MainView mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void attachView(MainView mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void saySth(CharSequence charSequence) {
        mMainView.showToast(charSequence);
    }

    @Override
    public void onResume() {
        mMainView.showToast("MainPresenterImpl onResume......");
    }

    @Override
    public void onDestroy() {
        mMainView.showToast("MainPresenterImpl onDestory......");
    }
}
