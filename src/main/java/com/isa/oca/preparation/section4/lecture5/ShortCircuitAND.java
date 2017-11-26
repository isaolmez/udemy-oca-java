package com.isa.oca.preparation.section4.lecture5;

public class ShortCircuitAND {

    public static void main(String[] args) {
        if (isAdult(20) && isAdult(15)) {
            System.out.println("First is OK");
        }
        if (isAdult(9) && isAdult(8)) {
            System.out.println("Second is OK");
        }
    }

    public static boolean isAdult(int age) {
        if (age >= 18) {
            System.out.println(age + " >= 18");
            return true;
        } else {
            System.out.println(age + " < 18");
            return false;
        }
    }

}
