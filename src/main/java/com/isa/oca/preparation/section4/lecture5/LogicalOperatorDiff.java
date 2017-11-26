package com.isa.oca.preparation.section4.lecture5;

public class LogicalOperatorDiff {

    public static void main(String[] args) {
        // Short-circuit operator
        // Skips the second operand
        int m = 5;
        if (++m > 5 || ++m > 6) {
            System.out.println(m); // m = 6
        }

        // Non short-circuit operator
        // Evaluates the second operand
        m = 5;
        if (++m > 5 | ++m > 6) {
            System.out.println(m); // m = 7
        }
    }
}
