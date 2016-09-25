package ru.spbstu.java_classes.lesson2.oop.inheritance;

import ru.spbstu.java_classes.lesson2.oop.inheritance.shapes.Circle;
import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Color;
import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Vector2D;
import sun.security.provider.SHA;

public class MyObject /* extends Object */ {

    public static void main(String[] args) {
        String str1 = new String("hello");

        System.out.println(str1.hashCode());

        Circle circle = new Circle(new Vector2D(0, 0), 10, Color.GREEN);

        System.out.println(circle);
        System.out.println(circle.hashCode());
        System.out.println(Integer.toHexString(circle.hashCode()));

        System.out.println(circle instanceof Shape);

        System.out.println(circle.equals(str1));
    }

}
