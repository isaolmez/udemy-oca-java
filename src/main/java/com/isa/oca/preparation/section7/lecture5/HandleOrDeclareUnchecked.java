package com.isa.oca.preparation.section7.lecture5;

public class HandleOrDeclareUnchecked {

}

class RunTimeExceptions {

    void foo() { // No need declare here
        throw new NullPointerException();
    }

    // No need to handle or declare unchecked exceptions
    void bar() {
        foo();
    }

    // But you can. It makes no difference to the compiler
    void bar2() throws NullPointerException {
        foo();
    }

    void bar3() {
        try {
            foo();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}

class Errors {

    void go() { // No need declare here
        throw new StackOverflowError();
    }

    // No need to handle or declare errors. They are unchecked.
    void travel() {
        go();
    }

    // You dont have to; but you can handle
    void travel2() {
        try {
            go();
        } catch (StackOverflowError e) {
            e.printStackTrace();
        }

    }

    // You dont have to; but you can declare
    void travel3() throws StackOverflowError {
        go();
    }

}