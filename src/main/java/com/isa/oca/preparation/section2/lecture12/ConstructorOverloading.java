package com.isa.oca.preparation.section2.lecture12;

class Foo {

    public Foo() {
        this(0);
    }

    public Foo(int count) {
        this(count, "unknown");
    }

    public Foo(int count, String name) {
        super(); // call Object class's constructor
        System.out.println("count: " + count + " name: " + name);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Foo foo = new Foo();
    }
}
