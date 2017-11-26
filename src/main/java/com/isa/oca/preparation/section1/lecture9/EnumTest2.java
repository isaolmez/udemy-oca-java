package com.isa.oca.preparation.section1.lecture9;

class Shirt2 {

    enum ShirtColor {RED, GREEN, BLUE, BLACK}

    ShirtColor color;
}

public class EnumTest2 {

    public static void main(String[] args) {
        Shirt2 shirt = new Shirt2();
        shirt.color = Shirt2.ShirtColor.RED;
    }
}
