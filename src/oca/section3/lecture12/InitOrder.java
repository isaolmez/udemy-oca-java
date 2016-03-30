package oca.section3.lecture12;

class InitOrder {
//	int x = assignX();

	InitOrder(int val) {
		System.out.println("1-arg constructor");
	}

	InitOrder() {
		System.out.println("No-arg constructor");
	}

	{  // Instance init block
		System.out.println("1st Instance Init");
	}

	static {  // Static init block
		System.out.println("1st Static Init");
	}

	{  // Instance init block
		System.out.println("2nd Instance Init");
	}

	static {  // Static init block
		System.out.println("2nd Static Init");
	}

	private int assignX() {
		System.out.println("Instance variable x is being assigned");
		return 100;
	}

	public static void main(String[] args) {
		new InitOrder();
		new InitOrder(100);
	}
}
