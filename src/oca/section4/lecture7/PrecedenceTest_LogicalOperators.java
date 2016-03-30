package oca.section4.lecture7;

public class PrecedenceTest_LogicalOperators {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;
		System.out.println(a == 1 && b == 1 || c == 1);
		// equals to
		System.out.println(true && true || true);
		// is interpreted as
		System.out.println((true && true) || true); // Last true is not evaluated, it is skipped!
		System.out.println("******");

		// What if?
		System.out.println(++a == 2 && ++b == 2 || ++c == 2);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("******");

		// Or what is the result?
		System.out.println(true || false && true && false);
		// is interpreted as
		System.out.println(true || (false && true && false));
		// NOT interpreted as
		System.out.println((true || false) && true && false);
	}
}
