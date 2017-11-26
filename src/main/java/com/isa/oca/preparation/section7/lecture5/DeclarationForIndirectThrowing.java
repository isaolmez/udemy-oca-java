package com.isa.oca.preparation.section7.lecture5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DeclarationForIndirectThrowing {

    static void study() throws FileNotFoundException {
        read();
    }

    static void read() throws FileNotFoundException {
        FileReader reader = new FileReader("test");
    }
}
