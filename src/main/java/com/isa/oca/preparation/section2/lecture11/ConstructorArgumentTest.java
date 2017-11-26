package com.isa.oca.preparation.section2.lecture11;

public class ConstructorArgumentTest {

}

class Car {

    public Car(String name) {
        System.out.println(name);
    }
}

class RaceCar extends Car {

    public RaceCar() {
        // super(getName()); // Compiler error.
        super(getNameasStatic());
    }

    public String getName() {
        return "race car";
    }

    public static String getNameasStatic() {
        return "race car";
    }
}