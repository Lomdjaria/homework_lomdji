package ru.spbstu.java_classes.lesson2.stuff;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        int[] intArr = new int[10];
        printArray(intArr);

        Arrays.fill(intArr, 2, 4, 7);
        printArray(intArr);

        intArr[2] = 2;
        intArr[7] = 4;
        Arrays.sort(intArr);
        printArray(intArr);

        int index = Arrays.binarySearch(intArr, 2);
        System.out.println(index);

        int[] copy = Arrays.copyOf(intArr, 9);
        printArray(copy);

        System.out.println(intArr == copy);

    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.print(value + " ");
        }

//        for (int i = 0; i < intArr.length; i++) {
//            System.out.print(intArr[i] + " ");
//        }
        System.out.println();
    }

}
