package ru.spbstu.java_classes.lesson2.oop.inheritance;

import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Color;

public abstract class Shape {
    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    abstract public double getArea();
}
