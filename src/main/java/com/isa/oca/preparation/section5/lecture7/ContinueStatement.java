package com.isa.oca.preparation.section5.lecture7;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Next line of code");

        for (int j = 0; j < 3; j++) {
            System.out.println("j: " + j);
            if (j == 1) {
                continue;  // continue has no effect here!
            }
        }
    }
}
