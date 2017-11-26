package com.isa.oca.preparation.section3.lecture5;

public class PrimitiveCastingWidening {

    public static void main(String[] args) {
        /**
         * Widening
         */
        // int to long
        int fi = 2;
        long li = fi;    // Implicit cast. Widening.

        //float to double
        float f1 = 23.2F;
        double d1 = f1;    // Implicit cast. Widening.

        // byte to double
        byte bw = 12;
        double dw = bw;    // Implicit cast. Widening.

        // char to int
        char cw = 'k';
        int iw = cw;    // Implicit cast. Widening.

    }
}
