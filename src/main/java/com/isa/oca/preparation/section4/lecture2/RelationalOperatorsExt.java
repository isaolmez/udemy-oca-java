package com.isa.oca.preparation.section4.lecture2;

public class RelationalOperatorsExt {

    public static void main(String[] args) {
        // Compare float and double.
        double d = 12.2;
        float f = 12.2F;
        System.out.println("d= " + d);
        System.out.println("f= " + f);
        System.out.println("d==f ? " + (d == f));            // false. Bit patterns are different

        // Cast float to double
        System.out.println("(double)f = " + (double) f);
        System.out.println(
                "d==(double)f ? " + (d == (double) f));    // false. Bit patterns are different

        /**
         * Comparison without fraction
         */
        double dd = 12.0;
        double ff = 12.0F;
        System.out.println("dd == ff ? " + (dd == ff));
    }
}
