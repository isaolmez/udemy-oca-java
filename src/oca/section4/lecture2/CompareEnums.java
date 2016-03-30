package oca.section4.lecture2;

public class CompareEnums {
	enum CoffeeSize {
		TALL, GRANDE, VENTI
	}

	public static void main(String[] args) {
		// Same constant always return the same instance. 
		CoffeeSize s1 = CoffeeSize.GRANDE;
		CoffeeSize s2 = CoffeeSize.GRANDE;
		if (s1 == s2) {
			System.out.println("== operator");
		}
		
		if (s1.equals(s2)) {
			System.out.println("equals method");
		}
	}
}
