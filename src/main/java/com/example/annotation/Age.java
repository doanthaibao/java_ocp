package com.example.annotation;

import reactor.util.annotation.Nullable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@interface Jak {
    
}
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Age {
    int number() default 0;
//    String[] value();
    int value();
    int t() default 10;
    Jak j = null;

}
