package com.isa.oca.preparation.section7.lecture6;

import java.io.IOException;

public class ProgrammaticExceptions {

    void setEmptySeats(int count) {
        if (count < 0) {
            throw new IllegalArgumentException();
        }
    }

    void summarizeTheBook(String book) throws IOException {
        if (book.equals("unknown")) {
            throw new IOException();
        }
    }

    // You can also throw exceptions that are generally thrown by JVM
    void process(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
    }
}
