package com.isa.oca.preparation.section4.lecture3;

import java.io.Closeable;

public class InstanceofOperator {

    public static void main(String[] args) {
        boolean b;
        Number n = new Integer(12);
        b = n instanceof Number;
        System.out.println(b);

        b = n instanceof Object;
        System.out.println(b);

        b = n instanceof Integer;
        System.out.println(b);

        b = n instanceof Float;
        System.out.println(b);

        b = n instanceof Closeable;
        System.out.println(b);

        /**
         * Before a downcast
         */
        if (n instanceof Integer) {
            Integer i = (Integer) n;
        }
    }
}
