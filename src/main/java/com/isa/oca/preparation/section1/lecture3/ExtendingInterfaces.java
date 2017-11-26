package com.isa.oca.preparation.section1.lecture3;

public class ExtendingInterfaces {

}

/**
 * Interfaces can extend other interfaces
 */
interface A {

}

interface B {

}

interface C extends A, B {

}

/**
 * Interfaces cannot extend classes
 */
class X {

}

// interface Y extends X {
// }