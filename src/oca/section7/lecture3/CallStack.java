package oca.section7.lecture3;

public class CallStack {
	public static void main(String[] args) {
		methodA();
	}
	static void methodA() {
		methodB();
	}
	static void methodB() {
	}
}
