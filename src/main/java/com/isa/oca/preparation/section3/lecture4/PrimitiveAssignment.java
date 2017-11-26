package com.isa.oca.preparation.section3.lecture4;

public class PrimitiveAssignment {

    public static void main(String[] args) {
        int x = 4;        // literal assignment
        int y = x - 3;    // assignment with an expression (including a literal)
        int z = x / y;    // assignment with an expression

        /**
         * Every numeric literal is implicitly int
         */
        int i = 120;  // 120 is integer literal
        int j = 15; // 15 is integer literal

        /**
         * Compiler puts an implicit cast, if literal fits into the range
         */
        byte b = 15;  // Implicit cast.
        byte b2 = (byte) 15;   // Explicit cast.

        /**
         * Compiler needs an explicit cast, if literal doesn't fit into the range
         */
        byte b3 = (byte) 150;

        /**
         * Even if the variable fits into the range, compiler needs an explicit cast
         */
        int i4 = 15;
        byte b4 = (byte) i4;

        /**
         * The result of an expression involving anything int-sized or smaller is always an int.
         */
        byte k = 5;       // Implicit cast, 5 fits in a byte
        byte l = 7;       // Implicit cast, 7 fits in a byte
        byte n = 5 + 7;   // Implicit cast, 12 fits in a byte

        // Needs an explicit cast
        byte m = (byte) (k + l); // Should be OK, sum of the two bytes fits in a byte

        /**
         * If you make variables final, you don’t need an explicit cast.
         */
        final byte k2 = 5;
        final byte l2 = 7;
        byte n2 = 5 + 7;    // OK, no need explicit cast
        byte m2 = k2 + l2;    // OK, no need explicit cast


    }
}
