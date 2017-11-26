package com.isa.oca.preparation.section2.lecture11;

public class DefaultConstructorTest {
    // Compiler implicitly adds CONSTRUCTOR with public access level
    /**
     public DefaultConstructorTest() {
     super();
     }
     **/
}

class Dog {
    // Compiler implicitly adds CONSTRUCTOR with default access level
    /**
     Dog() {
     super();
     }
     **/
}

class Dog2 {

    Dog2() {
        // Compiler implicitly adds call to super()
        /**
         super();
         **/
    }
}