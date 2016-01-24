package com.threshold.dagger2study.utils;

import android.content.Context;
import android.widget.Toast;

import com.threshold.dagger2study.App;

import javax.inject.Inject;

/**
 * Created by Threshold on 2016/1/18.
 */
public class ToastUtil {
    private Context context;

    @Inject
    public ToastUtil(Context context) {
        this.context = context;
    }

    public void show(CharSequence charSequence,int duration) {
        Toast.makeText(context,charSequence,duration).show();
    }

    public void showShort(CharSequence charSequence) {
        show(charSequence, Toast.LENGTH_SHORT);
    }

    public void showLong(CharSequence charSequence) {
        show(charSequence,Toast.LENGTH_LONG);
    }

}
