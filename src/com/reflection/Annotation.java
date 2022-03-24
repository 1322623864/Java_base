package com.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@myAnnotation(name = "Jeffk",age = 21)
public class Annotation {

}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation{
    String name() default "";
    int age();
    int id() default -1;
    String[] schools() default {"哈啊哈"};
}
