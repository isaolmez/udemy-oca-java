package oca.section5.lecture4;

public class DoWhileLoop {
	public static void main(String[] args) {
		do {
			System.out.println("Runs always at least once");
		} while (false);

		int count = 0;
		do {
			System.out.println(count);
			count++;
		} while (count < 5);
		
		// Curly braces are skipped
		do
			System.out.println("hi");
		while(true);

	}
}
