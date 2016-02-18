package com.threshold.dagger2study.model;

import com.threshold.dagger2study.annotation.ActivityScope;
import com.threshold.dagger2study.utils.ToastUtil;

import javax.inject.Inject;

/**
 * Created by Threshold on 2016/1/23.
 */
public class GreetManager {

    private ToastUtil toastUtil;
    @Inject
    public GreetManager(@ActivityScope ToastUtil toastUtil) {
        this.toastUtil = toastUtil;
    }

    public void showNiHao() {
        toastUtil.showShort("你好！");
    }

    public void showHello() {
        toastUtil.showShort("GreetManager: Hello");
    }

}
