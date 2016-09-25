package ru.spbstu.java_classes.lesson2.exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tests {

    public static void main(String[] args) /* throws MyCheckedException */ {
        try {
            foo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // foo(); // cant call without try/catch

        // No need to catch
        uncheckedTest();

        //checkedTest(); // must try-catch or add throws to main

        try {
            throw new MyCheckedException();
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }

    private static void uncheckedTest() {
        throw new MyUncheckedException();
    }

    private static void checkedTest() throws MyCheckedException {
        throw new MyCheckedException();
    }

    private static void foo() throws FileNotFoundException {
            FileInputStream fin = new FileInputStream("resources/input.txt");
    }

    private static void a() {
        String str = null;
        str.getBytes();
        System.out.println("unreachable code");
    }
}

/* See exceptions.png */
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException() {
        super("My cool exception");
    }
}

class MyCheckedException extends Exception {
    public MyCheckedException() {
        super("My checked exception");
    }
}

