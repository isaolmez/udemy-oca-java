package oca.section5.lecture2;

public class SwitchCase {
	public static void main(String[] args) {
		/**
		 * case variable must be final and compile time constant
		 */
		final int x = 5;
		final int y;
		y = 10;
		int val = 0;
		switch (val) {
		case x: // Compiles
		// case y: // Compiler error
		}
		
		switch (val) {
		case 12:	// integer literal
		case 'c':	// char literal
		case x: // variable that is final and compile-time constant  
		}
		
	}
}
