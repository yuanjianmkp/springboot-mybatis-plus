package com.mkp.springbootdemo1.common;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface Description {
    String value() default "";
}
