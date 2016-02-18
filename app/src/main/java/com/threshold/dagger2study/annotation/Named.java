package com.threshold.dagger2study.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Threshold on 2016/2/18.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Named {
    String value() default "";
}
