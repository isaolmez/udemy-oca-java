package oca.section3.lecture10;

import oca.common.Animal;

public class Initialization {
	public static void main(String[] args) {
		// A Game array
		Game[] games = new Game[3];
		games[0] = new Game();
		games[1] = new Game();
		games[2] = new Game();

		
		int[] ages = new int[5];
		ages[4] = 1; // OK. The last valid index is 4.
//		ages[5] = 1; // Runtime exception. Compiles fine.
//		ages[100] = 1; // Runtime exception. Compiles fine.


		// Declare and initialize an array holding three references
		int[][] movieRatings = new int[3][];
		movieRatings[0] = new int[4];
		movieRatings[1] = new int[6];
		movieRatings[2] = new int[1];
		
		/**
		 * Initialize the array
		 * 3 ways
		 */
		Animal[] animals = new Animal[4];
		// Index by index
		animals[0] = new Animal();
		animals[1] = new Animal();
		animals[2] = new Animal();
		animals[3] = new Animal();

		// In a for loop
		for (int i = 0; i < animals.length; i++) {
			animals[i] = new Animal();
		}
		
		// In a foreach loop
		for (Animal animal : animals) {
			animal = new Animal();
		}

	}
}
