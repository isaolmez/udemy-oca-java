package com.isa.oca.preparation.section3.lecture8;

public class ExamTaker {

    public void takeTest() {
        int questionIndex;
//		System.out.println("Solving question: " + questionIndex); // Uninitialized variable
    }

    public void takeTest2() {
        int questionIndex;
        int x = 1;
        if (x < 70) {    // x is smaller than 70, but compiler is not so sure!
            questionIndex = 1;
        }

//		System.out.println("Solving question: " + questionIndex);  // Compiler error.
    }

    public void takeTest3() {
        int questionIndex;
        if (1 < 70) {
            questionIndex = 1;
        }

        System.out.println("Solving question: " + questionIndex); // Uninitialized variable
    }

    public void takeTest4() {
        int questionIndex;
        int x = 1;
        if (x < 70) {
            questionIndex = 1;
        } else {
            questionIndex = 70;
        }

        System.out.println("Solving question: " + questionIndex); // Uninitialized variable
    }
}
