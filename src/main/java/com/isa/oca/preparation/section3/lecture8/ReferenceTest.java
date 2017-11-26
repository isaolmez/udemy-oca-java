package com.isa.oca.preparation.section3.lecture8;

public class ReferenceTest {

    String myStr;

    public void printStr() {
        System.out.println("String: " + myStr);
    }

    public static void main(String[] args) {
        new ReferenceTest().printStr();
    }
}
