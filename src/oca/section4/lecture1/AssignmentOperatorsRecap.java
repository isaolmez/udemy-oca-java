package oca.section4.lecture1;

public class AssignmentOperatorsRecap {
	public static void main(String[] args) {
		// Following two perform same operations
		int a = 2;
		a = a * 10;
		
		a = 2;
		a *= 10;

		
		// Following two perform same operations
		int b = 1;
		b = b + 3 * 4;
		
		b = 1;
		b += 3 * 4;

		// Following two perform same operations
		int x = 10;
		x *= 6 + 10;
		
		x = 10;
		x = x * (6 + 10);

	}
}
