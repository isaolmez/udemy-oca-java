package com.isa.oca.preparation.section3.lecture5;

public class PrimitiveCastingNarrowing {

    public static void main(String[] args) {
        /**
         * Narrowing with values Within Range
         */

        // long to byte
        long lw = 32L;
        byte aw = (byte) lw;
        System.out.println("aw: " + aw);

        // long to int
        long lw2 = 1500L;
        int aw2 = (int) lw2;
        System.out.println("aw2: " + aw2);

        /**
         * Narrowing with values Out of Range
         */

        // int to byte
        byte bo = (byte) 421;
        System.out.println("bo:" + bo);
        int io = 421;
        byte bo2 = (byte) io;
        System.out.println("bo2: " + bo2);

        // int to char
        char co = (char) -12;
        System.out.println("co: " + (int) co);
        int io2 = -12;
        char co2 = (char) io2;
        System.out.println("co2: " + (int) co2);

        /**
         * Floating-point numbers to integer types
         */
        float a2 = 1420.290f;
        int b2 = (int) a2;  // float can lose data
        System.out.println(b2); // Prints 1420

        /**
         * Narrowing - truncation occurs
         */
        // int to byte
        byte b = (byte) 250;
        System.out.println(b);

        // long to byte
        long l = 250L;
        byte a = (byte) l;
        System.out.println(a);

        // long to int
        long lo = 2147483649L;
        int in = (int) lo;
        System.out.println(in);


    }
}
