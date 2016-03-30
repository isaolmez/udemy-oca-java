package oca.section4.lecture7;

public class PrecedenceTest_ConditionalOperators {
	public static void main(String[] args) {
		int a;
		int b;

		a = 1;
		System.out.println(a++ == 2 );
		System.out.println("a: " + a);
		System.out.println("******");
		
		
		a = 1;
		System.out.println(++a == 2 );
		System.out.println("a: " + a);
		System.out.println("******");
		
		a = 1;
		System.out.println(a++ == a);
		System.out.println("a: " + a);
		System.out.println("******");
	
		a = 1;
		b = 1;
		System.out.println(a++ == a && ++b == 2);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("******");
	
	}
}
