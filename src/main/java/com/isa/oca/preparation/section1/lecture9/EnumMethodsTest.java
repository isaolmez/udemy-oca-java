package com.isa.oca.preparation.section1.lecture9;

public class EnumMethodsTest {

    enum ShirtColor {RED, GREEN, BLUE, BLACK}

    public static void main(String[] args) {
        ShirtColor[] values = ShirtColor.values();
        for (ShirtColor shirtColor : values) {
            System.out.print("Name: " + shirtColor.name());
            System.out.println(", Ordinal: " + shirtColor.ordinal());
        }

        ShirtColor parsed = ShirtColor.valueOf("GREEN");
        System.out.println(parsed);
    }
}
