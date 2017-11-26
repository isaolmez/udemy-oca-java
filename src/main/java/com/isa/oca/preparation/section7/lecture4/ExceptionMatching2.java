package com.isa.oca.preparation.section7.lecture4;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionMatching2 {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test");
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

        /**
         * Multi-catch block must have classes that are in different inheritance trees
         */
//		try {
//			FileReader reader = new FileReader("test");
//		} catch (FileNotFoundException | IOException e) {
//			e.printStackTrace();
//		}

        /**
         * Catch block variable e is final
         * Cannot be re-assignned
         */
        try {
            FileReader reader = new FileReader("test");
        } catch (IOException | NullPointerException e) {
//			e = new IOException();
        }
    }
}
