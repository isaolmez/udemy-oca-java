package oca.section1.lecture3;
/**
 * 
 *  Interface methods must always be public and abstract
 *  
 *  But you do not have to explicitly declare them
 *  
 *  Even though you don't declare that way, they are implicitly public and abstract
 *
 */
public interface IllegalInterfaceMethodModifiers {
//	final void fly(); 	// final and abstract can never be used
						// together, and abstract is implicitly
						// existent

	
//	static void fly(); 	// interfaces define instance methods

	
//	private void fly(); // interface methods are always public

	
//	protected void fly(); // interface methods are always public

}
