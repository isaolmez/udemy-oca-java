package com.isa.oca.preparation.section2.lecture2;

public class PolymorphismTest {

    public static void main(String[] args) {
        GymTeacher gymTeacher = new GymTeacher();
        MathTeacher mathTeacher = new MathTeacher();
        assignToClass(gymTeacher);
        assignToClass(mathTeacher);
    }

    public static void assignToClass(Teacher teacher) {
        teacher.hiClass();
    }
}
