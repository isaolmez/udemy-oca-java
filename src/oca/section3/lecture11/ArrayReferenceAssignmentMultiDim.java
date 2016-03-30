package oca.section3.lecture11;

public class ArrayReferenceAssignmentMultiDim {
	public static void main(String[] args) {
		int[] foos;
		int[][] bars = new int[3][];
//		foos = bars; // Compiler error. bars is two dimensional
		int[] gums = new int[6];
		foos = gums; // OK, gums is one dimensional.
	}
}
