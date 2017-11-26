package com.isa.oca.preparation.section4.lecture4;

public class StringConcatenation {

    public static void main(String[] args) {
        /**
         * Basic String concatenation
         */
        String cert = "OCA " + "certification";
        String hello = "*******\n" + "Hello World" + "\n*******";
        System.out.println(cert);
        System.out.println(hello);

        /**
         * Combine with objects
         */
        String meet = "Hi! I am " + new Visitor("John") + ". Nice to meet you!";
        System.out.println(meet);

        /**
         * Number and String combinations
         */
        String x = "Question";
        int y = 3;
        int z = 5;
        System.out.println(x + y + z);  // Prints Question35
        System.out.println(x + (y + z));  // Prints Question8
        System.out.println(y + z + x);  // Prints 8Question

    }
}
