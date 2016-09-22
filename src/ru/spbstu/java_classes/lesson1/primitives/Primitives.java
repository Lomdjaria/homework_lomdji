package ru.spbstu.java_classes.lesson1.primitives;

import java.io.IOException;


public class Primitives {

    static int intStatic;

    public static void main(String[] args) throws IOException {
        // 8 primitives
        byte 	b = 0;          // 8 bit == 1 byte
        short 	s = 77;	        // 16 bit == 2 bytes
        int 	i; 	            // 32 bit == 4 bytes
        long 	l = 1_000_000; 	// 64 bit == 8 bytes
        char	c = 'a';        // 16 bit == 2 bytes (UTF-16 chars)
        boolean bool = true;    // 1 byte
        float 	f = 2e-2f;      // 32 bits
        double 	d = 23_000.4__500 ; // 64 bits

        //out.println(intStatic);
        // System.out.println(i); // Error

        char    c2 = '\u004D';
        int     octal = 010; // 8
        int     hexadecimal = 0x10; // 16
        int     binary = 0b10; // 2

        // other - Objects

        // COnversions
        i = 100500;
        l = i;
        i = s;
        s = b;

        s = b;
        i = s;
        l = i;

        // to char
        b = (byte) c;
        s = (short) c;
        i = c;
        l = c;
        f = c;
        d = c;
//        i = bool; // Error
//        bool = intStatic; // Error

        // Operations
        // + - * /  | & ^ ...you know...

        // Names
        int $name123;
        int _name$2;
        int ИМЯ_В_СТИЛЕ_1С;
        int 奇妙な名前;
        // String String = new String(); // OK =D
        //int 2Name; // error

        float f1 = (float)-1e100; // -Infinity
        float f2 = (float)1e-50; // 0.0
    }
    
}





