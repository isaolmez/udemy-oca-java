package com.isa.oca.preparation.section7.lecture1;

public class TryCatchCombinations {

    public static void main(String[] args) {
        /**
         * 1
         */
        try {
            // Risky code here
        } catch (Exception e) {
            // Handle exception
        }

		/*
         * 2
		 */
        try {
            // Risky code here
        } catch (Exception e) {
            // Handle exception
        } finally {
            // Clean up
        }

        /**
         * 3
         */
        try {
            // risky code here
        } finally {
            // Clean up
        }


    }
}
