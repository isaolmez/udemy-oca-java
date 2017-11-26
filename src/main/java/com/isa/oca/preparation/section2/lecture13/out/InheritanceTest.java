package com.isa.oca.preparation.section2.lecture13.out;

public class InheritanceTest {

    public static void main(String[] args) {
        Computer c = new Computer();
        c.test();
        // Machine.id; // Compiler error. Cannot access
        // Machine.printMotto(); // Compiler error. Cannot access
    }
}