package com.isa.oca.preparation.section5.lecture5;

public class ForcedExitSystemExit {

    public static void main(String[] args) {
        /**
         * Forced exit with System.exit
         */
        testExit();
        System.out.println("Back to caller!");
    }

    public static boolean testExit() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i: " + i);
            System.exit(0);
        }
        System.out.println("After the loop");
        return true;
    }
}
