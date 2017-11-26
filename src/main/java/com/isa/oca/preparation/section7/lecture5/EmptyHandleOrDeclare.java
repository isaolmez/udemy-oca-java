package com.isa.oca.preparation.section7.lecture5;

public class EmptyHandleOrDeclare {

    void solid() {
        // try {
        // Code here does not throw IOException or its subtypes
        // }
        // catch (IOException e) { // Compiler error.
        // }
    }

    void liquid() {
        try {
            // No code here
        } catch (NullPointerException e) { // Compiles
        }
    }
}
