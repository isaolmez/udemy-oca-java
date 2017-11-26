package com.isa.oca.preparation.section2.lecture7;

public class UpDowncastTest {

    public static void main(String[] args) {
        /**
         * Upcasting
         */
        Bird bird = new Eagle();        // Implicit upcasting
        Bird bird2 = (Bird) new Eagle(); // Explicit upcasting

        // We can now call Bird methods on bird and bird2 reference variables
        bird.fly();
        bird2.fly();
//		bird.hunt(); // Compiler error. Cannot see Eagle's hunt() method. 

        /**
         * Downcasting
         */
        Eagle eagle = (Eagle) bird;
        Eagle eagle2 = (Eagle) bird2;
        // Let's call Eagle methods
        eagle.hunt();
        eagle2.hunt();
    }
}
