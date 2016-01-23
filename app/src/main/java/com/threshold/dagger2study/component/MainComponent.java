package com.threshold.dagger2study.component;

import com.threshold.dagger2study.annotation.ActivityScope;
import com.threshold.dagger2study.module.HelloModule;
import com.threshold.dagger2study.module.MainModule;
import com.threshold.dagger2study.ui.MainActivity;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = { AppComponent.class },
        modules = {
                MainModule.class,
                //HelloModule.class
        }
)
public interface MainComponent {
    void inject(MainActivity activity);

}
