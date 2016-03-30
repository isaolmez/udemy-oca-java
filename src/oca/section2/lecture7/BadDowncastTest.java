package oca.section2.lecture7;

public class BadDowncastTest {
	public static void main(String[] args) {
		Bird bird = new Bird(); 		// Implicit upcasting
		bird.fly();
		
		// Downcast to Eagle
		Eagle eagle = (Eagle) bird;
		// Call Eagle methods
		eagle.hunt(); // Compiles. Fails at RUNTIME
	}
}
