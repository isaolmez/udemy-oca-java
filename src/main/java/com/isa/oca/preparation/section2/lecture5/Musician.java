package com.isa.oca.preparation.section2.lecture5;

class Instrument {

}

class Violin extends Instrument {

}

public class Musician {

    public void play(Instrument ins) {
        System.out.println("Playing Instrument");
    }

    public void play(Violin vio) {
        System.out.println("Playing Violin");
    }

    public static void main(String[] args) {
        Musician musician = new Musician();
        Instrument instrument = new Instrument();
        Violin violin = new Violin();
        musician.play(instrument);
        musician.play(violin);

        // What now?
        Instrument violinDisguised = new Violin();
        musician.play(violinDisguised);
    }
}
