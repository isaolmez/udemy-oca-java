package oca.section2.lecture13;

public class StaticAccessTest {

	static int result;
	
	public void calculateThat(){
		result = 10 * getMultiplier();
	}
	
	public static int getMultiplier(){
		return 2;
	}
	
	public static void main(String[] args) {
		System.out.println(getMultiplier()); // OR StaticAccessTest.staticGetMethod()
//		System.out.println(calculateThat());  // Compiler error. Cannot call instance member from static method
	}
}
