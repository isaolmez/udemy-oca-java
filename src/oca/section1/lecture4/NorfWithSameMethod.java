package oca.section1.lecture4;

public class NorfWithSameMethod extends Baz {

	void testWhisper() {
		/**
		 * This is NOT inherited method
		 * This calls newly created method 
		 * prints "I am here Norf!";
		 */
		whisper();
	}
	
	/**
	 * This is not overriding
	 * Only creating new method with same name, by chance
	 */
	public void whisper(){
		System.out.println("I am here Norf!");
	}
}
