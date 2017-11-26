package com.isa.oca.preparation.section3.lecture7;

class ScopeErrors1 {

    int count = 0;

    public static void main(String[] args) {
        // count++; // Compiler error. Cannot access instance variable from static method.
    }
}
