package com.isa.oca.preparation.section1.lecture6;

public class ConstructorTest {

}

class Certificate {

    // Legal constructors

    Certificate() {
    }

    private Certificate(short questions) {
    }

    protected Certificate(int time) {
    }

    Certificate(int age, int... scores) {
    }

    // Illegal constructors

    void Certificate() {
    } // it's a method, NOT a CONSTRUCTOR

    // Certificate2() { } // not a method or a constructor

    // Certificate(); // looks like an abstract method

    // static Certificate() { } // can't be static

    // final Certificate() { } // can't be final

    // abstract Certificate(String s) { } // can't be abstract

    // Certificate(int... x, int t) { } // bad var-arg syntax
}
