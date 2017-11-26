package com.isa.oca.preparation.section5.lecture4;

public class WhileLoop {

    public static void main(String[] args) {
		int a = 0;
        while (a < 100) {
            System.out.println(a);
            a++;
        }

        int b = 200;
        while (b < 100) {
            System.out.println("In the while loop");
            b++;
        }
        System.out.println("Passed the while loop");

        int c = 0;
		while (c < 100) {
			System.out.println(c++);
		}

    }
}
