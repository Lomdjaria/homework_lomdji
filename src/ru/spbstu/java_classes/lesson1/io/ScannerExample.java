package ru.spbstu.java_classes.lesson1.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ScannerExample {

    static final String INPUT_FILE_PATH = "resources/input.txt";
    static final String OUTPUT_FILE_PATH = "resources/output.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream(INPUT_FILE_PATH);
        FileOutputStream fout = new FileOutputStream(OUTPUT_FILE_PATH);

        Scanner scanner = new Scanner(fin);
        OutputStreamWriter writer = new OutputStreamWriter(fout);

        int numLines = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < numLines; i++){
            String line = scanner.nextLine();
            String trimmedLine = line.trim();
            fout.write(trimmedLine .getBytes());
        }

        scanner.hasNextFloat(); // ~scanner.nextFloat();
        scanner.hasNextInt(); // ~scanner.nextInt();
        scanner.hasNextBoolean(); // ~scanner.nextBoolean();

        fin.close();
        fout.close();
    }

}
