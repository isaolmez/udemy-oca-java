package oca.section4.lecture7;

class ComparisonAdvancedTest {
	static boolean a, b, c;

	public static void main(String[] args) {
		boolean result = false;
		a = false;
		b = false;
		c = false;
		result = (a = true) || (b = true) && (c = true);
		System.out.println("result: " + result);
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		
		a = false;
		b = false;
		c = false;
		result = (b = true) && (c = true) || (a = true);
		System.out.println("result: " + result);
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		
		a = true;
		b = true;
		c = false;
		result = (a = false) && (b = false) || (c = true);
		System.out.println("result: " + result);
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		
		a = false;
		b = false;
		c = false;
		result = (a = true) && (b = true) | (c = true);
		System.out.println("result: " + result);
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		
		a = false;
		b = false;
		c = false;
		result = (a = true) | (b = true) && (c = true);
		System.out.println("result: " + result);
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
	
		boolean x = true;
		System.out.println(x |= false == false);
		
	}
}