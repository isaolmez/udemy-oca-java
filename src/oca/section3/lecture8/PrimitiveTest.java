package oca.section3.lecture8;

public class PrimitiveTest {
	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bool;

	public void printValues() {
		System.out.println("byte: " + b + "\nshort: " + s + "\nchar: " + c + "\nint: " + i);
		System.out.println("long: " + l + "\nfloat: " + f + "\ndouble: " + d + "\nboolean: " + bool);
	}

	public static void main(String[] args) {
		new PrimitiveTest().printValues();
	}
}
