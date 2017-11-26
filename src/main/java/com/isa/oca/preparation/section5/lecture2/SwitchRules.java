package com.isa.oca.preparation.section5.lecture2;

public class SwitchRules {

    public static void main(String[] args) {
        /**
         * Case constants should fit in type range
         */
        byte b = 25;
        switch (b) {
            case -128:
            case 127:
                // case 300: // Compiler error. 300 is not in byte range, -128 to 127
        }

        /**
         * Duplicate cases cause compile-time errors
         */
        switch (12) {
            // case 3:
            case 3:
            case 4:
            default:
        }

        /**
         * You can benefit from boxing in expression
         */
        Integer input = new Integer(25);
        final Integer caseVal = new Integer(10);
        switch (input) {
            case 4:
                System.out.println("OK");
//		case caseVal: // Compiler error.
        }

    }
}
