package com.threshold.dagger2study.presenter.interfaces;

import com.threshold.dagger2study.ui.interfaces.MainView;

/**
 * Created by Threshold on 2016/1/18.
 */
public interface MainPresenter {

    void attachView(MainView mainView);

    void saySth(CharSequence charSequence);

    void onResume();

    void onDestroy();
}
