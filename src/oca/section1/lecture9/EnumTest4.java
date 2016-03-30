package oca.section1.lecture9;


class Shirt3 {
	EnumTest4.ShirtColor color;
}

public class EnumTest4 {
	
	enum ShirtColor { RED, GREEN, BLUE, BLACK }; // semicolon at the end is OPTIONAL
	
	public static void main(String[] args) {
		Shirt3 shirt = new Shirt3();
		shirt.color = ShirtColor.RED;
	}
}
