package com.isa.oca.preparation.section2.lecture13;

public class StaticFinalTest {

    final static int y = 5;  // Declare and initialize at the same time
    final static int x;  // Only declare

    static {
        x = 12; // Can initialize in static block
//		x = 13; // Cannot assign new value. Already initialized.
    }
}

class TT extends StaticFinalTest {

    void test() {
        int ab = x;
    }
}
