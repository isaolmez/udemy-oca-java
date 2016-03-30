package oca.section6.lecture2;

public class StringEqualityToString {
	public static void main(String[] args) {
		String x = "abc";
		String y = "abc";
		System.out.println(x == y); // Prints true.

		System.out.println(x.toString() == y); // Prints true.
		System.out.println(x.toString() == y.toString()); // Prints true.

		System.out.println(x == new String(y)); // Prints false.
		System.out.println(new String(x) == new String(y)); // Prints false.
	}
}
