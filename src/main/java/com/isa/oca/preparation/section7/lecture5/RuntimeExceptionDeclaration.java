package com.isa.oca.preparation.section7.lecture5;

public class RuntimeExceptionDeclaration {

    public static void main(String[] args) {
        dontHaveToButYouCan();
    }

    static void dontHaveToButYouCan() throws ArrayIndexOutOfBoundsException {
        int[] tickets = new int[7];
        System.out.println(tickets[7]); // will throw ArrayIndexOutOfBoundsException
    }

    static void dontHaveToButYouCan2() {
        int[] tickets = new int[7];
        System.out.println(tickets[7]); // will throw ArrayIndexOutOfBoundsException
    }
}
