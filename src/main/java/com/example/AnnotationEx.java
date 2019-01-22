package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value1() default "xyz";
}

class HelloAnno {

    @MyAnnotation
    public void hello() {
        System.out.println("Hello");
    }

}

public class AnnotationEx {

    public static void main(String[] args) throws NoSuchMethodException {
        HelloAnno hello = new HelloAnno();
        hello.hello();

        Method m = hello.getClass().getMethod("hello");
        MyAnnotation anno = m.getAnnotation(MyAnnotation.class);
        System.out.println(anno.value1());
    }

}