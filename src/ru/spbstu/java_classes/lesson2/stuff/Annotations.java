package ru.spbstu.java_classes.lesson2.stuff;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

//@MyAnnotation
public class Annotations {

    @MyAnnotation
    int field;

    @MyAnnotation
    public static void main(String[] args) {
        foo();
    }

    @Deprecated
    static void foo() {
        System.out.println("foo");
    }
}

@Retention(RetentionPolicy.RUNTIME)
//@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE })
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, /* TYPE */})
@interface MyAnnotation {}