package com.isa.oca.preparation.section4.lecture3;

public class InstanceofWithNull {

    public static void main(String[] args) {
        Animal myAnimal = null;
        if (myAnimal instanceof Animal) {
            System.out.println("an instance of Animal");
        } else {
            System.out.println("NOT an instance of Animal");
        }

        if (null instanceof Animal) {
            System.out.println("an instance of Animal");
        } else {
            System.out.println("NOT an instance of Animal");
        }
    }
}
