package ru.spbstu.java_classes.lesson1.primitives;

public class MainArguments {
    public static void main(String[] args) {
        // 1 variant (nicer)
        for(String arg : args) {
            System.out.println(arg);
        }

        // 2 variant
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
