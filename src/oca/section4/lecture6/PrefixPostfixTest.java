package oca.section4.lecture6;

public class PrefixPostfixTest {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		if ((b == a++) | (a < ++b)) {
			System.out.println("a = " + a + " b = " + b);
		}
		

		// Used post-increment var second time in the same expression
		a = 1;
		System.out.println(a++ + 1 + a);
		System.out.println("a: " + a);
		
		a = 1;
		System.out.println(a++ + a);
		System.out.println("a: " + a);
		
		a = 1;
		System.out.println(a + a++);
		System.out.println("a: " + a);

	}
}
