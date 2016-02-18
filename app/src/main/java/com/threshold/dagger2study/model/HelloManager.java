package com.threshold.dagger2study.model;

import com.threshold.dagger2study.utils.ToastUtil;

import javax.inject.Inject;

/**
 * Created by Threshold on 2016/2/18.
 */
public class HelloManager {
    private String type;
    private ToastUtil toastUtil;

    @Inject
    public HelloManager(ToastUtil toastUtil) {
        this(toastUtil, "Chinese");
    }

    public HelloManager(ToastUtil toastUtil, String type) {
        this.toastUtil=toastUtil;
        this.type = type;
    }

    public void sayHello() {
        if (type.equals("Chinese")) {
            toastUtil.showShort("你好！（Chinese）");
        } else {
            toastUtil.showShort("Hello! (English)");
        }
    }


}
