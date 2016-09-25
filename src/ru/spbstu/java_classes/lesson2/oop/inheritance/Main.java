package ru.spbstu.java_classes.lesson2.oop.inheritance;


import ru.spbstu.java_classes.lesson2.oop.inheritance.shapes.Circle;
import ru.spbstu.java_classes.lesson2.oop.inheritance.shapes.Square;
import ru.spbstu.java_classes.lesson2.oop.inheritance.shapes.Triangle;
import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Color;
import ru.spbstu.java_classes.lesson2.oop.inheritance.utils.Vector2D;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Vector2D(1, 2), 5, Color.BLUE);

        Square square = new Square(new Vector2D(3, 4), 10, Color.GREEN);

        Triangle triangle = new Triangle(new Vector2D(0, 0),
                                         new Vector2D(0, 1),
                                         new Vector2D(1, 0),
                                         Color.RED);

        Shape shape = square;
        Object obj = triangle;
        triangle = (Triangle) obj; // must gess
//        square = (Square) obj; // Exception
        // instanceof - признак неправильного использования ООП

        Shape[] shapes = {circle, square, triangle};
        printArrayElements(shapes);

        Shape maxShape = getShapeWithMaxArea(shapes);
        System.out.println("Shape with max area:" + maxShape.getArea() + "; " + maxShape);
    }

    private static void printArrayElements(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(i + ": " + objects[i]); // ~objects[i].toString
        }
    }


    private static Shape getShapeWithMaxArea(Shape[] shapes) {
        Shape maxShape = null;
        double maxArea = Double.NEGATIVE_INFINITY;

        for (Shape shape : shapes) {
            double area = shape.getArea();
            if(area > maxArea){
                maxArea = area;
                maxShape = shape;
            }
        }

        return maxShape;
    }

}
