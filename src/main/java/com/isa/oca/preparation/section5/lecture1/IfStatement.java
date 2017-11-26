package com.isa.oca.preparation.section5.lecture1;

public class IfStatement {

    public static void main(String[] args) {
		int a = 5;
        if (a == 5) {
            System.out.println("a is equal to 5");
        } else {
            System.out.println("a is not equal to 5");
        }

        // Bad practice
		if (a == 5) {
			System.out.println("Only I am bound to if statement.");
		}
        System.out.println("Not bound to if statement.");
        System.out.println("Me too! I always run.");

        // Beware of the indentation
		if (a == 5) {
			System.out.println("Only I am bound to if statement.");
		}
        System.out.println("Do not be fooled! I always run.");
        System.out.println("indentation can bite! I always run.");
    }
}
