package Conditionals;

public class IfElse {
	public static void main(String[] args) {
		// else, birden fazla if c�mlesine ait olabilecekse en i�teki if c�mlesine aittir
		if(true)
			if(true)
				System.out.println("inner if");
			else
				System.out.println("inner else");
		
		
		
	}
}
