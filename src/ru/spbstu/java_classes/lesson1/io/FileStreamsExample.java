package ru.spbstu.java_classes.lesson1.io;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileStreamsExample {

    static final String INPUT_FILE_PATH = "resources/input.txt";
    static final String OUTPUT_FILE_PATH = "resources/output.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream(INPUT_FILE_PATH);
        FileOutputStream fout = new FileOutputStream(OUTPUT_FILE_PATH);

        byte[] buffer = new byte[32];

        while(fin.read(buffer) != -1) {
            String str = new String(buffer);
            System.out.println(str + "...");
//            System.out.print(str);
            Arrays.fill(buffer, (byte) 0);
        }

        fin.close();
        fout.close();
    }

    public static void messy() throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream(INPUT_FILE_PATH);
            fout = new FileOutputStream(OUTPUT_FILE_PATH);
            // ... do something...
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fin.close();
            fout.close();
        }
    }

}
