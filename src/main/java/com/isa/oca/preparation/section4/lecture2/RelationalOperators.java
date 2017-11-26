package com.isa.oca.preparation.section4.lecture2;

public class RelationalOperators {

    public static void main(String[] args) {
        boolean a = 3 > 1; // true
        int x = 10;
        boolean b = x >= 100; // false
        boolean c = x < 100; // true
        int y = 5;
        boolean d = x == y; // false
        boolean e = (x != y); // true

        System.out.println("a = 3 > 1: " + a);
        System.out.println("x >= 100: " + b);
        System.out.println("x < 100: " + c);
        System.out.println("x == y: " + d);
        System.out.println("(x != y): " + e);

        // char type comparisons
        System.out.println();
        System.out.println("char c: " + (int) 'c');
        System.out.println("char A: " + (int) 'A');
        boolean b1 = 'c' >= 'A'; // true
        boolean b2 = 'c' >= 65; // true
        boolean b3 = 'c' >= 65.5; // true
        boolean b4 = 'c' >= 65.5F; // true
        System.out.println("'c' >= 'A': " + b1);
        System.out.println("'c' >= 65: " + b2);
        System.out.println("'c' >= 65.5: " + b3);
        System.out.println("'c' >= 65.5F: " + b4);

    }
}
