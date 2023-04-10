package com.mys.annotation;


import java.lang.annotation.*;

/**
 * @Description:自定义的注解
 * @Author：supxiaoxin
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AccessLimit {
    int seconds();
    int maxCount();
    boolean needLogin()default true;
}
