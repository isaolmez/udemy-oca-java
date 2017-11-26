package com.isa.oca.preparation.section7.lecture6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Rethrowing {

    // Handles and declares
    void rethrow() throws FileNotFoundException { // Declare the exception
        try {
            new FileReader("test");
        } catch (FileNotFoundException e) { // Catch the exception
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            System.out.println("finally");
        }
    }
}
