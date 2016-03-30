package oca.section5.lecture4;

public class ForLoopDeclareInitialize {
	public static void main(String[] args) {
		/**
		 * Declare and initialize multiple variables
		 */
		for(int i = 0, j = 0, k = 0 ; i < 10; i++){
			System.out.println(i);
		}
		
				
		/**
		 * Cannot access variables defined after the for loop
		 */
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
//		System.out.println(i); // Compiler error. Cannot access i.
		
		
		/**
		 * Can skip declaration and initialization
		 */
		int i = 0;
		for (   ; i < 10; i++) {
			System.out.println(i);
		}
		
	}
}
