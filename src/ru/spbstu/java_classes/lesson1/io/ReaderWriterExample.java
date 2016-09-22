package ru.spbstu.java_classes.lesson1.io;

import java.io.*;

public class ReaderWriterExample {

    static final String INPUT_FILE_PATH = "resources/input.txt";
    static final String OUTPUT_FILE_PATH = "resources/output.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream(INPUT_FILE_PATH);
        FileOutputStream fout = new FileOutputStream(OUTPUT_FILE_PATH);

        InputStreamReader reader = new InputStreamReader(fin);
        OutputStreamWriter writer = new OutputStreamWriter(fout);

        int read = 0;
        while((read = reader.read()) != -1) {
            System.out.println((char)read);
        }

        fin.close();    // == reader.close();
        fout.close();   // == reader.close();
    }

}
