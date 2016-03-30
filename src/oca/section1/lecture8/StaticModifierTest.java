package oca.section1.lecture8;

public class StaticModifierTest {
	static {									// Static initialization block
		System.out.println("Class loaded!");
	}
	protected static String name = "OCA Prep";  // Static variable
	public static void print(){					// Static method
		System.out.println("Work and Pass!");
	}
	
	static class innerStatic{}					// Static inner class
}

class StaticModifierClient{
	public void testIt(){
		System.out.println(StaticModifierTest.name);
		StaticModifierTest.print();
	}
}
