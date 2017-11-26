package com.isa.oca.preparation.section7.lecture1;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            // try code block is guarded.
            // Code that might throw exception goes here.
            // There can be many code lines or just one.
            methodA();
            methodB();
        } catch (ExceptionOne e) {
            // Code block that handles ExceptionOne.
        } catch (ExceptionTwo e) {
            // Code block that handles ExceptionTwo.
        }
    }

    private static void methodA() throws ExceptionOne {
    }

    private static void methodB() throws ExceptionTwo {
    }
}
