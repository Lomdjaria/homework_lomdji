package ru.spbstu.java_classes.lesson1.primitives;

public class StringPool {

    public static void main(String[] args) {
        System.out.println("Strings:");
        strings();
        System.out.println();


        System.out.println("Integers:");
        integers();
        System.out.println();
    }

    private static void strings() {
        String str1 = "Some smart words";   // placed in String pool
        String str2 = "Some smart words";   // taken from String pool
        String str3 = "Some" + " smart " + "words"; // also taken from String pool
        String str4 = new String("Some smart words"); // creates new object
        String str5 = new String("Some smart words");
        String str6 = new String("Some smart words").intern(); // also taken from String pool

        String smart = " smart ";
        String str7 = "Some" + smart + "words";

        System.out.println(str1 == str2);   // true
        System.out.println(str1 == str3);   // true
        System.out.println(str1 == str4);   // false
        System.out.println(str1 == str6);   // true
        System.out.println(str1 == str7);   // false

        System.out.println(str4 == str5);   // false
    }

    private static void integers() {
        Integer i1 = 120;
        Integer i2 = 120;
        Integer i3 = new Integer(120);

        System.out.println(i1 == i2); // true
        System.out.println(i1 == i3); // false

        Integer i4 = 130;
        Integer i5 = 130;
        Integer i6 = new Integer(130);

        System.out.println(i4 == i5); // false
        System.out.println(i4 == i6); // false
    }
}
