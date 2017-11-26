package com.isa.oca.preparation.section4.lecture6;

class IncrementTest {

    static int chaptersFinished = 3;

    public static void main(String[] args) {
        System.out.println("Finished chapters: " + chaptersFinished++);
        System.out.println("Finished chapters: " + chaptersFinished);
        System.out.println("Finished chapters is now: " + ++chaptersFinished);
    }
}
