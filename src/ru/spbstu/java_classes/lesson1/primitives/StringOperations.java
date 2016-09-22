package ru.spbstu.java_classes.lesson1.primitives;

import java.util.Arrays;

import static java.lang.System.out;

public class StringOperations {

    // Strings are immuatable!!

    public static void main(String[] args) {
        String str1 = " Winter   is ";
        String str2 = "   coming     ";
        String str = str1 + str2;
        String strLong = str = str1.concat(str2).concat(" very").concat(" fast");
        String str5 = new String("qwe");

        System.out.print("hello wr ");
        out.println(str);
        out.println(strLong);

        out.println("trim:       " + str.trim());

        out.println("replace:    " + str.replace(" ", "_"));

        out.println("replaceAll: " + str.trim().replaceAll("\\s+", " "));

        out.println("charAt:     " + str.charAt(4));

        out.println("substring:  " + str.substring(2, 11));

        String text1 = "text123";
        String text2= "text12456";
        out.println("matches:    " + text1.matches("[a-zA-Z]+\\d{2,3}"));
        out.println("matches:    " + text2.matches("[a-zA-Z]+\\d{2,3}"));

        System.out.println("Words");
        String[] words = str.split("\\s+");
        for (String word : words) {
            out.println(word.trim());
        }

        String geronimo = "Geronimo";
        char[] arrayOfChars = {'G', 'e', 'r', 'o', 'n', 'i', 'm', 'o'};
        byte[] arrayOfBytes = {71, 101, 114, 111, 110, 105, 109, 111};

        String first = new String(arrayOfChars);
        String second = new String(arrayOfBytes);
        String third = new String(geronimo);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


        String strange = "奇";
        System.out.println(Arrays.toString(strange.getBytes()));
    }

}
