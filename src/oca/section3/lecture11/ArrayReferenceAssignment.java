package oca.section3.lecture11;

public class ArrayReferenceAssignment {
	public static void main(String[] args) {
		
		/**
		 * Primitive Arrays
		 */
		int[] vals;
		int[] nums = new int[12];
		short[] mins = new short[15];
		int[] nextNums = new int[4];
		
		vals = nums; // Compiles. nums refers to an int array
		// vals = mins; // Does not compile. mins refers to a short array
		vals = nextNums; // Compiles. Reassigned to another int array with different siz
		
		
		
		/**
		 * Object Arrays
		 */
		Water[] bottles = new Water[5];
		bottles = new TapWater[20]; 	// OK. TapWater is subclass of Water.
		SpringWater[] sws = new SpringWater[10];
		bottles = sws;  				// OK. SpringWater is subclass of Water.
//		bottles = new Animal[12]; 		// Compiler error. Animal is not subclass of Water. 
		
		
		
		Drinkable[] ds = new Drinkable[5];
		ds = new TapWater[20];			// OK. TapWater implements Drinkable.
		SpringWater[] sws2 = new SpringWater[10];
		ds = sws2;						// OK. SpringWater implements Drinkable.
//		ds = new Water[8];				// Compiler error. Water does not implement Drinkable.
	}
}
