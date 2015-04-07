package chap1;

public class AbstractClassConcrete extends AbstractClassSub{

	public void trial() {
		// TODO Auto-generated method stub
		
	}

	public void trialNew() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		AbstractClassConcrete con = new AbstractClassConcrete();
		System.out.println(con.getC());
		con.setC(3);
		System.out.println(con.getC());
		
	}
	
}
