package oca.section5.lecture4;

public class ForLoopIteration {
	public static void main(String[] args) {
		/**
		 * Basic iteration expression
		 */
		for (int i = 0; i < 1; i++) {
			System.out.println(i);
		}
		
		/**
		 * Multiple iteration operations
		 */
		for (int i = 0, j = 0; i < 2; i++, j++) {
			System.out.println("i: " + i + " j: " + j);
		}
	}
}
