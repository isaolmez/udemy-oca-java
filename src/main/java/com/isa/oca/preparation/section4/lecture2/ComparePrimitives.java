package com.isa.oca.preparation.section4.lecture2;

class ComparePrimitives {

    public static void main(String[] args) {
        System.out.println("char 'x' == 'x': " + ('x' == 'x'));
        System.out.println("char 'x' == 'y': " + ('x' == 'y'));

        System.out.println("10 != 15: " + (10 != 15));
        System.out.println("12.0 == 12L: " + (12.0 == 12L));
        System.out.println("12.0F == 12L: " + (12.0F == 12L));
        System.out.println("12.0F == 12.0: " + (12.0F == 12.0));

        System.out.println("true == false: " + (true == false));
        System.out.println("false == false: " + (false == false));
    }
}
