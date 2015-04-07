package operators;

public class Increments {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		//3==2 | 3<4
		//x birinci comparede artmaz ikinci de artmış haliyle girer, çünkü expression bitmiştir.
		//y preincrement oldugu için direk artar.
		if ((y == x++) | (x < ++y)) {
			System.out.println("x = " + x + " y = " + y);
		}
		
		int z = 1;
		//fonksiyona verirken ise fonksiyon bitiminde değer artar
		if(print(z++) || z++ == 2)
			System.out.println(z);
		z=1;
		//preincrementte fonksiyona direk artmış gider.
		if(print(++z) || z++ == 2)
			System.out.println(z);
		
	}
	public static boolean print(int z){
		System.out.println("in function print:" + z);
		return false;
	}
	
}
class LogicalOperators{
	public static void main(String[] args) {
		//true olunca ya da false olunca diğerini yapmaz
		//||(OR) için ilki trueyasa, &&(AND) için ilki false diğerini evaulate etmez
		int z = 5; 
		if(++z > 5 || ++z > 6) z++;   // z = 7 after this code
		
		
		//bütün conditionları evaluate eder
		z = 5; 
		if(++z > 5 | ++z > 6) z++;   // z = 8 after this code

	
		//Bitwise
		if(true^false){
			System.out.println("2sinden birisi true olursa true döner");
		}
		if(true^true || false^false){
			System.out.println("2 false veya 2 trueda false döner");
		}
	}
}

