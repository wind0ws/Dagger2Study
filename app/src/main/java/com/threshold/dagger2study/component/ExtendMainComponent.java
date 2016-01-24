package com.threshold.dagger2study.component;

import com.threshold.dagger2study.annotation.ActivityScope;
import com.threshold.dagger2study.module.MainModule;
import com.threshold.dagger2study.ui.interfaces.MainView;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = { AppComponent.class },
        modules = {
                MainModule.class,
                //GreetModule.class
        }
)
public interface ExtendMainComponent extends MainComponent {
   MainView getMainView();
}
