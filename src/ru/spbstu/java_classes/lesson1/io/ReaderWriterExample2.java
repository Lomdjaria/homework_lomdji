package ru.spbstu.java_classes.lesson1.io;

import java.io.*;

public class ReaderWriterExample2 {

    static final String INPUT_FILE_PATH = "resources/input.txt";
    static final String OUTPUT_FILE_PATH = "resources/output.txt";

    // Absolutely Same as it previous example (ReaderWriterExample)
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(INPUT_FILE_PATH);
        FileWriter writer = new FileWriter(OUTPUT_FILE_PATH);

        int read = 0;
        while((read = reader.read()) != -1) {
            System.out.println((char)read);
        }

        reader.close();
        writer.close();
    }

}
