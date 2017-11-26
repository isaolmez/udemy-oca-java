package com.isa.oca.preparation.section5.lecture5;

public class ForcedExitBreak {

    public static void main(String[] args) {
        /**
         * Forced exit with break
         */
        testBreak();
        System.out.println("Back to caller!");
    }

    public static boolean testBreak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i: " + i);
            break;
        }
        System.out.println("After the loop");
        return true;
    }
}
