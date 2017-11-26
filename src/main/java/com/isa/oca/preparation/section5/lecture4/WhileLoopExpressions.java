package com.isa.oca.preparation.section5.lecture4;

public class WhileLoopExpressions {

    public static void main(String[] args) {
        int val = 1;
//		while (val) {} // Compiler error.
//		while (val = 5) {} // Compiler error. val = 5 resolves to 5.
        while (val == 5) {
        } // Compiles.
        while (true) {
            break;
        } // Compiles.

        boolean b = false;
        while (b) {
        }
        while (b = true) {
        }
        while (b == true) {
        }


    }
}
