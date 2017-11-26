package com.isa.oca.preparation.section2.lecture5;

public class OverloadTest {

    public static void main(String[] args) {
        Applicant applicant = new Applicant();
        applicant.apply(12);
        applicant.apply(12, "John");
        applicant.apply("John", "Doe");
    }
}
