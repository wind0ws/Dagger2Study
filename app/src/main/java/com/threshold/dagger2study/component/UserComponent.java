package com.threshold.dagger2study.component;

import com.threshold.dagger2study.App;
import com.threshold.dagger2study.model.data.User;
import com.threshold.dagger2study.module.UserModule;

import javax.inject.Singleton;

import dagger.Subcomponent;

@Singleton
@Subcomponent(
        modules = { UserModule.class }
)
public interface UserComponent {
    User getUser();
//    void inject(App app);
}
