package oca.section5.lecture4;

public class ForLoop {
	public static void main(String[] args) {
		// Basic for loop
		for (int i = 0; i < 3; i++) {
			System.out.println("i is " + i);
		}

		// Skip curly braces
		for (int i = 0; i < 3; i++)
			System.out.println("i is " + i);
	}
}
