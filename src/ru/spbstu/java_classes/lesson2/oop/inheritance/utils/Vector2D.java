package ru.spbstu.java_classes.lesson2.oop.inheritance.utils;

public class Vector2D {
    public static final Vector2D RIGHT = new Vector2D(0, 1);

    private final double x, y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Vector2D mult(double scalar) {
        return new Vector2D(x * scalar, y * scalar);
    }

    public Vector2D add(Vector2D vec) {
        return new Vector2D(x + vec.x, y + vec.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
