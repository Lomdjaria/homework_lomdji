package ru.spbstu.java_classes.lesson1.io;


import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class RelativeToClasspath {

    public static void main(String[] args) {
        try (InputStream is = RelativeToClasspath.class.getClassLoader().getResourceAsStream("input.txt");
             Scanner scanner = new Scanner(is)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
