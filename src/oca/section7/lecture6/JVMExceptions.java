package oca.section7.lecture6;

public class JVMExceptions {

	public static void main(String[] args) {
		int[] arr = new int[3];
		lookup(arr); // Will throw ArrayIndexOutOfBoundsException.
		
		int[] arr2 = null;
		lookup(arr2); // Will throw NullPointerException.
	}

	static void lookup(int[] someArray) {
		System.out.println(someArray[10]);
	}
}
