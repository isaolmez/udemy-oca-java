package oca.section3.lecture9;

class Criteria{
	int param1 = 5;
}
public class ReferencePassing {
	public void testMe(Criteria c){
		c.param1 = 12;  	// Changes the object myC is referring
		c = new Criteria(); // Does not assign myC to new Criteria 
		c = null;			// Does not assign myC to null
	}
	
	public static void main(String[] args) {
		ReferencePassing test = new ReferencePassing();
		Criteria myC = new Criteria();
		System.out.println("myC: " + myC.param1);
		test.testMe(myC);
		System.out.println("myC: " + myC.param1);
	}
}
