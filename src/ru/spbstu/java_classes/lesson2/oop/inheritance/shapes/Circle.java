package ru.spbstu.java_classes.lesson2.oop.inheritance.shapes;

import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Color;
import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Vector2D;
import ru.spbstu.java_classes.lesson2.oop.inheritance.Shape;

public class Circle extends Shape {
    private final Vector2D center;
    private final double radius;

    public Circle(Vector2D center, double radius, Color color) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public Vector2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //@Override
//    public String toString() {
//        return "Circle{" +
//                "center=" + center +
//                ", radius=" + radius +
//                '}';
//    }
}
