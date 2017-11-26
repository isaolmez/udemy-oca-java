package com.isa.oca.preparation.section3.lecture2;

public class CharacterLiterals {

    public static void main(String[] args) {
        /**
         * Common declaration
         */
        char c1 = 'O';
        char c2 = 'C';
        char c3 = 'A';
        System.out.println(c1 + "" + c2 + "" + c3);

        /**
         * Unicode declaration
         */
        char lettera = 'a';
        char letterA = '\u0041'; // The letter 'A'
        char letterZ = '\u005A'; // The letter 'Z'

        /**
         * Integer Assignments Legal declarations
         */
        char a = 0x725; // hexadecimal literal. Equals to 1829, less than 65535

        char b = 540; // int literal. Less than 65535

        char c = (char) 85000; // 70000 greater than 65535. Explicit cast needed to ensure the compiler we know the risks.

        char d = (char) -45; // Not in range 0 -65535. Explicitly cast

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println((int) c);
        System.out.println((int) d);

        /**
         * Illegal declarations
         */
        // char e = -45;  // Compiler error. Needs a cast
        // char f = 85000 // Compiler error. Needs a cast
    }
}
