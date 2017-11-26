package com.isa.oca.preparation.section4.lecture4;

public class PrecedenceOrder {

    public static void main(String[] args) {
        int a;
        a = 3 + 4 * 5;
        // is equal to
        a = 3 + (4 * 5);

        // Evaluate from LEFT to RIGHT
        int b;
        b = 3 + 4 * 5 + 6 * 5 / 10;

        b = 3 + (4 * 5) + ((6 * 5) / 10);

        b = 3 + 20 + ((6 * 5) / 10);

        b = 23 + ((6 * 5) / 10);

        b = 23 + (30 / 10);

        b = 23 + 3;

        b = 26;
    }
}
