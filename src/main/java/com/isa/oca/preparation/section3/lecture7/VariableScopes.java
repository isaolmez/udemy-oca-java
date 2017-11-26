package com.isa.oca.preparation.section3.lecture7;

public class VariableScopes {

    private int num;            // instance variable

    static int countDown = 99; // Static variable

    // This is a initialization block
    // It is run before constructor
    {
        num = 7;
        int num2 = 5;  // Block variable
    }

    // Constructor
    public VariableScopes() {
        num += 15;
        int num3 = 9;  // Local variable
    }

    // Method
    public void shakeItUp() {
        // local variable
        int hey = 0; // Local variable

        // for loop code block
        for (int i = 0; i < 4; i++) { // Block variable
            hey += i + num;
        }

        // Code block. This is LEGAL
        {
            int a = 12;  // Block variable
        }
    }
}
