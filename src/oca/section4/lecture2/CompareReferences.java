package oca.section4.lecture2;

import oca.common.Animal;

public class CompareReferences {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = a;
		System.out.println("a == b ? " + (a == b));
		Animal c = new Animal();
		System.out.println("a == c ? " + (a == c));
		
		Pet p1 = new Pet("pebble");
		Pet p2 = new Pet("black");
		Pet p3 = new Pet("pebble");
		Pet p4 = p1;
		System.out.println("p1 == p2 ? " + (p1 == p2));
		System.out.println("p1 == p3 ? " + (p1 == p3));
		System.out.println("p1 == p4 ? " + (p1 == p4));
		
		

	}
}
