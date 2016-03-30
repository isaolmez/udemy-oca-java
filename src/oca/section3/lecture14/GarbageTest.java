package oca.section3.lecture14;

import oca.common.Animal;

public class GarbageTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a);
		// Now, the Animal object is not eligible for garbage collection
		a = null;
		// Now, the Animal object is eligible for garbage collection
	}
}
