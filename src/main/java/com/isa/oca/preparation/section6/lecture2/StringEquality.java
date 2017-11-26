package com.isa.oca.preparation.section6.lecture2;

public class StringEquality {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2); // Prints false.
        System.out.println(s1.equals(s2)); // Prints true.

        String s3 = "abc";
        String s4 = new String("abc");

        /**
         * Reference Equality
         */
        System.out.println("Reference Equality");
        System.out.println(s1 == s2); // Prints false.
        System.out.println(s1 == s3); // Prints true.
        System.out.println(s1 == s4); // Prints false.
        System.out.println(s2 == s4); // Prints false.

        /**
         * Value Equality
         */
        System.out.println("Value Equality");
        System.out.println(s1.equals(s2)); // Prints true.
        System.out.println(s1.equals(s3)); // Prints true.
        System.out.println(s1.equals(s4)); // Prints true.
        System.out.println(s2.equals(s4)); // Prints true.

    }
}
