package oca.section5.lecture2;

public class SwitchExpression {
	enum Proximity {
		CLOSE, FAR;
	}

	public static void main(String[] args) {
		/**
		 * Valid switch expressions
		 */
		int i = 5;
		switch (i) {
		case 4:
			break;
		}
		
		Proximity pr = Proximity.CLOSE;
		switch (pr) {
		case CLOSE:
			break;
		case FAR:
			break;
		}

		String str = "OCA";
		switch (str) {
		case "OCA":
			break;
		case "OCP":
			break;
		}

		/**
		 * Invalid switch expressions
		 */

		// long lo = 5;
		// switch (lo) { // Cannot switch on long variable
		// case 4:
		// break;
		// }

		// double d = 5.5;
		// switch (d) { // Cannot switch on double variable
		// case 4:
		// break;
		// }
		
		/**
		 * Method invocations
		 */
		switch (getName()) {
		case "Fred":
			break;
		case "Wilma":
			break;
		}
	}
	
	public static String getName(){
		return "Fred";
	}
}
