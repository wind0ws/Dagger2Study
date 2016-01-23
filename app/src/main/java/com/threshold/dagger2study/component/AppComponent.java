package com.threshold.dagger2study.component;

import android.content.Context;

import com.threshold.dagger2study.App;
import com.threshold.dagger2study.module.AppModule;
import com.threshold.dagger2study.module.CrashModule;
import com.threshold.dagger2study.module.ToastModule;
import com.threshold.dagger2study.utils.ToastUtil;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules ={ AppModule.class,
//                ToastModule.class,
                CrashModule.class
        }
)
public interface AppComponent {
    void inject(App app);
    App getApp();// 将APPModule中的App暴露给子组件：子组件和子模块就可以获取到了
   // ToastUtil getToastUtil();
}
