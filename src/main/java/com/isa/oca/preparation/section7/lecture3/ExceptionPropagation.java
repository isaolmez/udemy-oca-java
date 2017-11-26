package com.isa.oca.preparation.section7.lecture3;

import java.util.Date;

public class ExceptionPropagation {

    public static void main(String[] args) {
        wakeUp();
        System.out.println("Woke up");
    }

    static void wakeUp() {
        eatBreakfast();
        System.out.println("Ate breakfast");
    }

    static void eatBreakfast() {
        Date d = null;
        d.getTime(); // throws NullPointerException
    }
}
