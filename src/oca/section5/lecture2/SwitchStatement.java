package oca.section5.lecture2;

public class SwitchStatement {
	public static void main(String[] args) {
		int category = 2;
		if (category == 1) {
			System.out.println("Sports");
		} else if (category == 2) {
			System.out.println("Games");
		} else if (category == 3) {
			System.out.println("Books");
		} else if (category == 4) {
			System.out.println("Movies");
		} else {
			System.out.println("General");
		}

		// Above if else statements are simulated with
		// switch statement
		int newCategory = 2;
		switch (newCategory) {
		case 1:
			System.out.println("Sports");
			break;
		case 2:
			System.out.println("Games");
			break;
		case 3:
			System.out.println("Books");
			break;
		case 4:
			System.out.println("Movies");
			break;
		default:
			System.out.println("General");
		}
	}
}
