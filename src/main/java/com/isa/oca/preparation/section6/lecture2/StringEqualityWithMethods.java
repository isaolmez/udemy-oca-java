package com.isa.oca.preparation.section6.lecture2;

public class StringEqualityWithMethods {

    public static void main(String[] args) {
        /**
         * Results from String methods can be complicated.
         * First set of method invocations do not change the value.
         * These invocations return the original String object.
         * So equality returns false.
         */

        String x = "aaa";
        String y = "aaa";
        System.out.println(x == y); // Prints true.

        x = x.toLowerCase();
        y = y.toLowerCase();
        System.out.println(x == y); // Prints true.

        x = x.substring(0);
        y = y.substring(0);
        System.out.println(x == y); // Prints true.

        /**
         * Below method invocations change the value of String unlike above.
         * These invocations return a new String.
         * So equality returns false.
         */
        x = "aaA";
        y = "aaA";
        System.out.println(x == y); // Prints true.

        x = x.toLowerCase();
        y = y.toLowerCase();
        System.out.println(x == y); // Prints false.

        x = x.substring(1);
        y = y.substring(1);
        System.out.println(x == y); // Prints false.

    }
}
