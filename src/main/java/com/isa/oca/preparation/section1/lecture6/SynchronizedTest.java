package com.isa.oca.preparation.section1.lecture6;

public class SynchronizedTest {

    public synchronized void incrementPopulation() {
        System.out.println("Others are waiting till I am done!");
    }

    protected synchronized void incrementPopulation2() {
    }

    private synchronized void incrementPopulation3() {
    }

    synchronized void incrementPopulation4() {
    }

}
