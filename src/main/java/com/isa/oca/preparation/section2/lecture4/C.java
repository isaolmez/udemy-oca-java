package com.isa.oca.preparation.section2.lecture4;

public class C {

    public static void main(String[] args) {
        A superClassReference = new B();

        // Cannot invoke methods that are newly declared by the subclass.
        superClassReference.run(10);

        // Reference type has declared add method with an exception.
        // Although the subclass has removed the exception and JVM will invoke the subclass version of add() method, compiler still gives an error.
        // superClassReference.add();

        // Since reference type is super class, superclass's set() is invoked.
        superClassReference.set();

        B subClassReference = new B();
        // Calls static set() method of the subclass.
        subClassReference.set();

    }
}
