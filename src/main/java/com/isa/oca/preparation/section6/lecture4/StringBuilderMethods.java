package com.isa.oca.preparation.section6.lecture4;

public class StringBuilderMethods {

    public static void main(String[] args) {
        /**
         * append()
         */
        StringBuilder builder = new StringBuilder();
        builder.append("start"); // String
        builder.append(123); // int
        builder.append(true); // boolean
        System.out.println(builder.toString()); // Prints "start123true".

        /**
         * delete()
         */
        builder = new StringBuilder("0123456789");
        builder.delete(3, 6);
        System.out.println(builder.toString()); // Prints "0126789".
        // Notice, character 6 is not deleted!

        /**
         * insert()
         */
        builder = new StringBuilder("0123456789");
        builder.insert(4, "agent");
        System.out.println(builder.toString()); // Prints "0123agent456789".

        /**
         * reverse()
         */
        builder = new StringBuilder("Always cold in Arctic");
        builder.reverse();
        System.out.println(builder.toString()); // Prints "citcrA ni dloc syawlA"

        /**
         * toString()
         */
        builder = new StringBuilder("Let's do");
        String s = builder.append(" moon walk!").toString();
        System.out.println(s); // Prints "Let's do moon walk!"
    }
}
