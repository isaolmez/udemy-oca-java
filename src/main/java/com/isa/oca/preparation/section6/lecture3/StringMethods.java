package com.isa.oca.preparation.section6.lecture3;

public class StringMethods {

    public static void main(String[] args) {
        String s = "Hello World!";

        /**
         * charAt()
         */
        char wanterChar = s.charAt(4);
        System.out.println(wanterChar); // Prints "o".

        /**
         * concat()
         */
        String appendedStr = s.concat(" Again!");
        System.out.println(appendedStr); // Prints "Hello World! Again!"

        String s1 = "hi";
        String s2 = s1 + "5";
        System.out.println(s2); // Prints "hi5".
        s1 += "5";
        System.out.println(s1); // Prints "hi5".

        /**
         * equalsIgnoreCase()
         */
        boolean isEqual = s.equalsIgnoreCase("hello world!");
        System.out.println(isEqual); // "true"

        /**
         * length()
         */
        int len = s.length();
        System.out.println(len); // Prints "12".
        // int len2 = str.length; // Compiler error. Arrays have length attribute
        int[] intArr = new int[3];
        System.out.println(intArr.length); // Prints "3".

        /**
         * replace()
         */
        String replaced = s.replace('l', 'Y');
        System.out.println(replaced); // Prints "HeYYo WorYd!"

        /**
         * split()
         */

        String[] stringParts = s.split(" "); // Split around spaces
        for (String part : stringParts) {
            System.out.println("split part: " + part);
        }

        /**
         * substring()
         */
        String substring = s.substring(6);
        System.out.println(substring); // Prints "World!"

        String substring2 = s.substring(0, 2);
        System.out.println(substring2); // Prints "He"

        /**
         * toLowerCase()
         */
        String lowerCased = s.toLowerCase();
        System.out.println(lowerCased); // Prints "hello world!"

        /**
         * toString()
         */
        String itsMe = "It is me!";
        String itsMeAgain = itsMe.toString();
        System.out.println(itsMeAgain); // Prints "It is me!"

        /**
         * toUpperCase()
         */
        String upperCased = s.toUpperCase();
        System.out.println(upperCased); // Prints "HELLO WORLD!"

        /**
         * trim()
         */
        String lousyStr = "  	Hi there!\t\t		    ";
        String trimmed = lousyStr.trim();
        System.out.println("-" + trimmed + "-"); // Prints "-Hi there!-"
    }
}
