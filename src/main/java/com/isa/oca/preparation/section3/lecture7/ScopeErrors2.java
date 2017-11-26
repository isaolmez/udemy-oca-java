package com.isa.oca.preparation.section3.lecture7;

class ScopeErrors2 {

    public static void main(String[] args) {
        ScopeErrors2 s = new ScopeErrors2();
        s.foo();
    }

    public void foo() {
        int num = 10;
        bar();
        num++; // When bar() completes, y is back in scope
    }

    public void bar() {
//		num++; // Won't compile. num is local to foo()
    }
}
