package com.threshold.dagger2study.module;

import com.threshold.dagger2study.model.data.User;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    public User provideUser() {
        User user = new User();
        user.setName("张三 ");
        user.setAddress("合肥高新区");
        user.setAge(23);
        user.setPhone("13812345678");
        user.setSex("男");
        return user;
    }

}
