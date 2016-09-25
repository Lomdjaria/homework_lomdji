package ru.spbstu.java_classes.lesson2.oop.constructors;


import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Vector2D;

public class Vehicle {
    protected double speed = 0;
    protected Vector2D position;
    protected Vector2D direction = Vector2D.RIGHT;;

    public Vehicle(double speed, Vector2D position) {
        this.speed = speed;
        this.position = position;
    }

    public double getSpeed() {
        return speed;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void move(double dt) {
        position = position.add(direction.mult(speed * dt));
    }
}