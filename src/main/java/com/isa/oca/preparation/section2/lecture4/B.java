package com.isa.oca.preparation.section2.lecture4;

import java.io.IOException;

public class B extends A {

    // Not an overriding method. An overloaded method.
    public void run(int x, int y) {
    }

    // Compiler error. Not a valid overriding method.
    // The return type must be same as, or a subtype of, the original return type.
    // public long walk(){
    // return 1;
    // }

    // The access level can be less restrictive
    public void fly() {
        System.out.println("sub class fly");
    }

    public void glide() {
        System.out.println("sub class glide");
    }

    // Can throw narrower exceptions -> IOException
    // Can throw new RuntimeExceptions -> NullPointerException
    public void swim() throws IOException, NullPointerException {
        System.out.println("sub class swim");
    }

    // Can remove the exception.
    public void add() {
    }

    // Compiler error. Cannot override final methods
    // public final void get() {}

    // Cannot override static methods.
    // This is a brand new method. You cannot use super() for example.
    public static void set() {
        System.out.println("static method B");
    }

    // Compiler error. Cannot throw new checked exceptions.
    // public void talk() throws IOException {
    // }
}
