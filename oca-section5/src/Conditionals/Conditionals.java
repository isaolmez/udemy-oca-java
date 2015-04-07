package Conditionals;

public class Conditionals {
	public static void main(String[] args) {
		// && short circuit oldugu icin öncesini ve sonrasını tek bir expressiona dönüştürüyor.
		// soldan başlıyor false && false = false
		// sonra false || true = TRUE dönüyor
		if (false && false || true) {
			System.out.println("true");
		}

		// burada && short circuit oldugu için expression esasında şöyledir:
		// false && ( false | true )
		// bu da false && true = FALSE olur, yani birşey basmaz
		if (false && false | true) {
			System.out.println("true mu?");
		}

		// condition expression olarak sadece boolean assignmentları kullanılabilir, çünkü assignmentin değeri sağdaki değer yani boolean olacaktır
		boolean b = false;
		if (b = true) {
			System.out.println("boolean assignment");
		}
	}
}

class SwitchStatement {
	public static void main(String[] args) {
		// switch expressionı chat byte short int ve enum olabilir, String ve wrapperlar da olabilir
		// long float double olamaz
		int x = 1;
		switch (x) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println("default");
		}

		// eğer case değeri olarak bir değişken kullanılacaksa final olması gerekir.
		final int y = 2;
		switch (x) {
		case 1:
			System.out.println(1);
			break;
		case y:
			System.out.println(2);
			break;
		default:
			System.out.println("default");
		}

		// byte veya short limitlerini aşan case değerleri compile hatası alır. Compiler limitlerin aşıldığını bilir
		// fakat başına explicit cast eklersen (byte)128 gibi compile hatası almaz
		byte g = 2;
		switch (g) {
		case 23:
		case (byte) 128:
		}

		// aynı case değerine sahip birden fazla case olamaz, compile hatası alır
		int temp = 90;
		switch (temp) {
		// case 80 : System.out.println("80");
		case 80:
			System.out.println("80"); // won't compile!
		case 90:
			System.out.println("90");
		default:
			System.out.println("default");
		}

		// switch expressioni illa ki değişken olmasına gerek yok, literal değer de olabilir
		switch (2) {
		case 1:
		case 2:
		}

		// switch expressionı wrapper obje olabilir, unboxing kullanılır
		switch (new Integer(4)) {
		case 4:
			System.out.println("boxing is OK");
		}

		// wrapper objeler case değeri olarak kullanılaz ama
		final Integer caseInteger = new Integer(2);
		switch (2) {
		// case caseInteger:
		}

		// uyan bir case değeri switche giriş noktasıdır ve break göresiye kadar bütün kodu çalıştırır
		switch (2) {
		case 2:
			System.out.println("case 2 is entry point" + 2);
		case 3:
			System.out.println(3);
		case 4:
			System.out.println("until break" + 4);
			break;
		}
		
		
		//curly bracketlar case den sonra optional olarak koyulabilir.
		switch (2) {
		case 2:{}
		default:
			break;
		}

		//defaultun sırası önemli değildir en son ona girer. Burada 2. sırada olmasına rağmen en son girecek.
		//en son default girdi fakat altında diğer caseler olduğu için onları da çalıştırdı
		int xx = 2; 
		switch (xx) { 
		  case 2:  System.out.println("2"); 
		  default: System.out.println("default"); 
		  case 3: System.out.println("3"); 
		  case 4: System.out.println("4"); 
		}
		
		
	}
}

enum Color {
	red, green, blue
}

class SwitchEnum {
	public static void main(String[] args) {
		Color c = Color.green;
		switch (c) {
		case red:
			System.out.print("red ");
		case green:
			System.out.print("green ");
		case blue:
			System.out.print("blue ");
		default:
			System.out.println("done");
		}
	}
}
