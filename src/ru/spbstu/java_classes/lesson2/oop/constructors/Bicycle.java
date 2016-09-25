package ru.spbstu.java_classes.lesson2.oop.constructors;

import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Vector2D;

import java.io.Closeable;
import java.io.IOException;

public class Bicycle extends Vehicle implements Closeable {

    private int gear;

    // the Bicycle class has one constructor
    public Bicycle(double startSpeed, int startGear) {
        super(startSpeed, Vector2D.RIGHT);
        gear = startGear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(double decrement) {
        speed -= decrement;
    }

    /**
     * Method encreases speed scalar value
     *
     * @param increment speed increment
     */
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Bicycle finalize called");
        throw new RuntimeException("Finalize");
    }

    @Override
    public void close() throws IOException {

    }
}