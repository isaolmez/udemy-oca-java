package com.isa.oca.preparation.section5.lecture7;

public class LabeledStatements {

    public static void main(String[] args) {
		label1:
        System.out.println("label1 labels me!");
        label2:
        System.out.println("My label is label2");
        forLoop:
        // Finds usage with loops
		for (int i = 0; i < 3; i++) {
			;
		}

        /**
         * Labeled break and continue statements
         */
        System.out.println("*******");
        outerLoop:
        for (int i = 0; i < 3; i++) {
            int x = 0;
            while (x < 5) {
                System.out.println("x: " + x++);
                if (x == 2) {
                    break outerLoop;
                }
            }
        }

        System.out.println("*******");
        outerLoop:
        for (int i = 0; i < 3; i++) {
            int x = 0;
            while (x < 5) {
                System.out.println("x: " + x++);
                if (x == 2) {
                    continue outerLoop;
                }
            }
        }

        /**
         * Labels must match
         */
        System.out.println("*******");
        differentLabel:
        for (int i = 0; i < 3; i++) {
            int x = 0;
            while (x < 5) {
                System.out.println("x: " + x++);
                if (x == 2) {
//					continue outerLoop;  // Compiler error
                }
            }
        }
    }
}
