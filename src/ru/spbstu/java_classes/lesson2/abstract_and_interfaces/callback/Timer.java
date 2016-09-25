package ru.spbstu.java_classes.lesson2.abstract_and_interfaces.callback;

public class Timer {

    /* DO not use in production System.currentTimeMillis()!!!*/
    public long mesureTimr(Runnable runnable){
        long currentTime = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis() - currentTime;
    }

}
