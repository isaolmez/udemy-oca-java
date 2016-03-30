package oca.section3.lecture12;

public class InitBlocks {
	static int val;
	int count;
	static { // static init block
		System.out.println("InitBlocks class is being loaded!");
		val = 100;
	}

	{ // instance init block
		System.out.println("A new instance of InitBlocks is being created!");
		count = 10;
	}

	public static void main(String[] args) {
		new InitBlocks();
		new InitBlocks();
	}
}
