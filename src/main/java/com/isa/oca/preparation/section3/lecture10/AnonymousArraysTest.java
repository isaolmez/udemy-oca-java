package com.isa.oca.preparation.section3.lecture10;

public class AnonymousArraysTest {

    void sizeOfArray(int[] array) {
        System.out.println(array.length);
    }

    public static void main(String[] args) {
        AnonymousArraysTest u = new AnonymousArraysTest();
        u.sizeOfArray(new int[]{1, 3, 4, 1}); // pass it as an argument.
    }
}
