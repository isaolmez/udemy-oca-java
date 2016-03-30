package oca.section4.lecture3;

public class Cat extends Animal implements Lovely {
	public static void main(String[] args) {
		Bird b = new Bird();
		// System.out.println(b instanceof Cat); // Compiler error. Different inheritance hierarchy.
		
		System.out.println(b instanceof Bird);
		System.out.println(b instanceof Animal);
		System.out.println(b instanceof Lovely);
		System.out.println(b instanceof Object);
		
		System.out.println(b instanceof Parrot);
//		System.out.println(b instanceof Tabby);
	}
}
