package oca.section1.lecture3;
/**
 *  Interface constants must always be public static final
 *  
 *  But you do not have to explicitly declare them
 *  
 *  Even though you don't declare that way, they are implicitly public, static and final 
 *
 */
public interface InterfaceConstants {
	public int num1 = 5; 		// Looks non-static and non-final,  but both static and final!
	
	int num2 = 5; 				// Looks default, non-final,  non-static, but both public, static and final!

	static int num3 = 5; 		// Doesn't show final or public
	
	final int num4 = 5; 		// Doesn't show static or public
	
	public static int num5 = 5; // Doesn't show final
	
	public final int num6 = 5; 	// Doesn't show static
	
	static final int num7 = 5; 	// Doesn't show public
	
	public static final int num8 = 5; // what you get implicitly

}
