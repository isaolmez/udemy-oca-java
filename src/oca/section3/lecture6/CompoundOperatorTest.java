package oca.section3.lecture6;

public class CompoundOperatorTest {
	public static void main(String[] args) {
		byte b = 7;
		b += 5; // OK
		System.out.println(b);

		byte bb = 7;
		bb = (byte) (bb + 5); // Needs cast.
		System.out.println(bb);
	}
}
