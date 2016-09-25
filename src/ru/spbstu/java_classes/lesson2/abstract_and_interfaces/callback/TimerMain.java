package ru.spbstu.java_classes.lesson2.abstract_and_interfaces.callback;

import java.math.BigDecimal;

public class TimerMain {

    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.mesureTimr(new BigDecimalPower());
        System.out.println(time);
    }

    private static class BigDecimalPower implements Runnable {
        @Override
        public void run() {
            new BigDecimal("123456").pow(100000);
        }
    }
}
