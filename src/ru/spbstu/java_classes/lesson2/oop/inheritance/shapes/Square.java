package ru.spbstu.java_classes.lesson2.oop.inheritance.shapes;

import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Color;
import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Vector2D;
import ru.spbstu.java_classes.lesson2.oop.inheritance.Shape;

import java.io.Closeable;
import java.io.Serializable;

public class Square extends Shape {
    private final Vector2D corner;
    private final double size;

    public Square(Vector2D corner, double size, Color color) {
        super(color);
        this.corner = corner;
        this.size = size;
    }

    public Vector2D getCorner() {
        return corner;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "corner=" + corner +
                ", size=" + size +
                '}';
    }
}
