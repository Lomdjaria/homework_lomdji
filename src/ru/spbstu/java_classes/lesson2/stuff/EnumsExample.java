package ru.spbstu.java_classes.lesson2.stuff;

public class EnumsExample {

    public static void main(String[] args) {
        System.out.println(Key.ESCAPE.ordinal());
        System.out.println(Key.ESCAPE.name());
        System.out.println(Key.ESCAPE); // the same

        System.out.println();
        System.out.println("Values: ");
        for (Key key : Key.values()) {
            System.out.println(key);
        }

        System.out.println(Color.BLUE.toRgb());
    }
}

enum Key {
    LEFT,
    RIGHT,
    ESCAPE,
    SPACE;
}

enum Color {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    MY_COLOR(0x2ACE47);

    final int value;

    Color(int value) {
        this.value = value;
    }

    public String toRgb() {
        return new String("rgb("
            + (value & 0xFF0000) + ", "
            + (value & 0x00FF00) + ", "
            + (value & 0x0000FF) + ")"
        );
    }
}