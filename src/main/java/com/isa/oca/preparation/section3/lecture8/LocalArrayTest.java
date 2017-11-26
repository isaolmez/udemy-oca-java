package com.isa.oca.preparation.section3.lecture8;

public class LocalArrayTest {

    public static void main(String[] args) {
        int[] vals = new int[4];
        for (int i : vals) {
            System.out.println(i);
        }

        int[] nums;
//		for (int i : nums) { // Compiler error. "The local variable nums may not have been initialized"
//			System.out.println(i);
//		}
    }
}
