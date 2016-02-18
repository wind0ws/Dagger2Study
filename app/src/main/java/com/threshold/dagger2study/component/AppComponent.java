package com.threshold.dagger2study.component;


import android.content.Context;

import com.threshold.dagger2study.App;
import com.threshold.dagger2study.module.AppModule;
import com.threshold.dagger2study.module.CrashModule;
import com.threshold.dagger2study.module.ToastModule;
import com.threshold.dagger2study.module.UserModule;
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
   // void inject(App app);
   // App getApp();// 将APPModule中的App暴露给子组件：子组件和子模块就可以获取到了:本例中MainActivity需要注入App，但是MainComponent并没有提供，所以需要APPComponent将APPModule中的App暴露出来。
    Context getAppContext();//MainActivity需要注入GreetManager，GreetManager需要ToastUtil，而ToastUtil需要Context，需要暴露给子组件MainComponent
//     ToastUtil getToastUtil();
    UserComponent createUserComponent(UserModule userModule);//UserComponent是subComponent,subComponent可以拥有APPComponent所有的provision
    //对于依赖APPComponent的Component只能获得APPComponent所暴露的依赖，比如App Context
}
