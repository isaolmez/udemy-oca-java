package oca.section1.lecture9;

/**
 * Enums defined outside can only have public or default access
 *
 * Cannot be private or protected LIKE classes 
 */
enum ShirtColor { RED, GREEN, BLUE, BLACK }

class Shirt {
	ShirtColor color = ShirtColor.RED;
}

public class EnumTest {
	public static void main(String[] args) {
		Shirt shirt = new Shirt();
		shirt.color = ShirtColor.RED;
		System.out.println(shirt.color);
	}
}
