package ru.spbstu.java_classes.lesson2.oop.modifiers.finals;

public class Finals {
    public static final int MAIN_ANSWER = 2;

    public static void main(String[] args) {
        final int value = 2;
//        value = 4; // error
    }

    void bar(final double cost) {
//        cost = 4; // error
    }
}

class A {
    final void foo(){}
}

final class B extends A {
//    @Override
//    void foo(); // error
}

//class C extends B {} //errot
