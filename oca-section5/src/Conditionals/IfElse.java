package Conditionals;

public class IfElse {
	public static void main(String[] args) {
		// else, birden fazla if cümlesine ait olabilecekse en içteki if cümlesine aittir
		if(true)
			if(true)
				System.out.println("inner if");
			else
				System.out.println("inner else");
		
		
		
	}
}
