package oca.section4.lecture4;

public class PrecedenceOrder2 {
	public static void main(String[] args) {
//		int b = 3 + 4 * 5 + 6 * 5 / 10;
		int result = getOp1() + getOp2() * getOp3() + getOp4() * getOp5() / getOp6();
		System.out.println(result);
	}
	
	static int getOp1() {
		System.out.println("getOp1()");
		return 3;
	}

	static int getOp2() {
		System.out.println("getOp2()");
		return 4;
	}

	static int getOp3() {
		System.out.println("getOp3()");
		return 5;
	}
	
	static int getOp4() {
		System.out.println("getOp4()");
		return 6;
	}
	
	static int getOp5() {
		System.out.println("getOp5()");
		return 5;
	}
	
	static int getOp6() {
		System.out.println("getOp6()");
		return 10;
	}
}
