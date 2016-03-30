package oca.section2.lecture9;

import oca.section2.lecture9.override.Animal;

public class ReturnValueTest {

	public Animal catchAnimal() {
		return null;
	}

	public String[] print() {
		return new String[] { "A", "B", "C" };
	}

	public int nextNumber() {
		char a = 'a';
		return a;
	}

	public int payBill() {
		float bill = 20.5F;
		return (int) bill;
	}

	public void process() {
		// return "Processing";
	}

	public void process2() {
		return;
	}

	public A find() {
		return new B(); // Assume B extends A
	}

	public Object getValues() {
		int[] counters = { 100, 255 };
		return counters; // int array is an object
	}

}
