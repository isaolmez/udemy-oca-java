package com.isa.oca.preparation.section4.lecture7;

public class PrecedenceTest_ArithmeticOperators {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 5;
        System.out.println(-a++);
        System.out.println("a: " + a);
        System.out.println("******");

        a = 5;
        System.out.println(-++a);
        System.out.println("a: " + a);
        System.out.println("******");

        a = 1;
        b = 1;
        System.out.println(a++ + b);
        System.out.print("a: " + a);
        System.out.println(" b: " + b);
        System.out.println("******");

        a = 1;
        b = 1;
        c = 1;
        System.out.println(+b++ + a++ + c);
        System.out.print("a: " + a);
        System.out.print(" b: " + b);
        System.out.println(" c: " + c);
        System.out.println("******");

        a = 1;
        b = 1;
        System.out.println(a - +-+-b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("******");

        System.out.println(2 + 3 * 4 / 2 - 1 % 5);
    }
}
