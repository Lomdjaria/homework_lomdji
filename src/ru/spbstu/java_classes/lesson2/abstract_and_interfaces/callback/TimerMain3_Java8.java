package ru.spbstu.java_classes.lesson2.abstract_and_interfaces.callback;

import java.math.BigDecimal;

public class TimerMain3_Java8 {

    public static void main(String[] args) {
        Timer timer = new Timer();

        /* Compiles only if JDK-8 installed because of lambda-function, you can comment this line */
        long time = timer.mesureTimr(() -> new BigDecimal("123456").pow(100000));

        System.out.println(time);
    }

    private static class BigDecimalPower implements Runnable {
        @Override
        public void run() {
            new BigDecimal("123456").pow(100000);
        }
    }
}
