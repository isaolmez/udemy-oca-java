package stringconcat;

public class StringConcat {
	public static void main(String[] args) {
		//1- işlemler soldan sağa akar
		//2- operandlardan herhangi biri string ise concat olur
		System.out.println("string" + 3 + 4);
		
		//3- Fakat ikisi de sayı ise aritmetik işlem olur
		System.out.println(3 + 4 + "string");
	}
}
