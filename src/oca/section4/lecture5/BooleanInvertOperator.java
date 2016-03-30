package oca.section4.lecture5;

public class BooleanInvertOperator {
	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		System.out.println("!true: " + !t);
		System.out.println("!false: " + !f);
		System.out.println("!(t && !f): " + !(t && !f));
	}
}
