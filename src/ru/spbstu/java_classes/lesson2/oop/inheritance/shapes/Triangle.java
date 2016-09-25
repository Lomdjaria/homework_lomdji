package ru.spbstu.java_classes.lesson2.oop.inheritance.shapes;

import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Color;
import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Vector2D;
import ru.spbstu.java_classes.lesson2.oop.inheritance.Shape;

/**
 * Created by user on 24.09.2016.
 */
public class Triangle extends Shape {
    private final Vector2D a, b, c;

    public Triangle(Vector2D a, Vector2D b, Vector2D c, Color color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vector2D getA() {
        return a;
    }

    public Vector2D getB() {
        return b;
    }

    public Vector2D getC() {
        return c;
    }

    @Override
    public double getArea() {
        return Math.abs((a.getX() - c.getX()) * (b.getY() - c.getY())
                            - (b.getY() - c.getX()) * (a.getY() - c.getY())) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
