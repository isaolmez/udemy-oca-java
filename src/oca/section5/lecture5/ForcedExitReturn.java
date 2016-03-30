package oca.section5.lecture5;

public class ForcedExitReturn {
	public static void main(String[] args) {
		/**
		 * Forced exit with return
		 */
		testReturn();
		System.out.println("Back to caller!");
	}

	public static boolean testReturn() {
		for (int i = 0; i < 3; i++) {
			System.out.println("i: " + i);
			return true;
		}
		System.out.println("After the loop");
		return true;
	}
}
