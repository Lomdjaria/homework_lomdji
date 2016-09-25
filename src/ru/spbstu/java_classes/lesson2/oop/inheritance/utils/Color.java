package ru.spbstu.java_classes.lesson2.oop.inheritance.utils;

public enum Color {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    final int value;

    Color(int value) {
        this.value = value;
    }
}
