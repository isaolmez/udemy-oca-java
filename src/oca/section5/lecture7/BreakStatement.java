package oca.section5.lecture7;

public class BreakStatement {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				break;
			}
			System.out.println("i: " + i);
		}
		System.out.println("Next line of code");
	}
}
