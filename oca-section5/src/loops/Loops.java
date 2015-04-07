package loops;

public class Loops {
	public static void main(String[] args) {
		int xxx = 1;

		// curly bracket koymazsan sadece bir expression alır
		while (xxx == 2) {
			System.out.println("1");
		}

		// noktalı virgülü unutma
		do {

		} while (xxx == 2);

		// while loop ile aynıdır
		for (; xxx == 2;) {

		}

		// aynı tipten 0 veya birden çok değişken tanımlama yeridir. birden fazla değişken tanımlanırsa virgülle ayrılır.
		// decleration ve initialization for da en önce ve sadece bir defa olur. burdaki değişkenlerin scopeları loop bitince sona erer yani ulaşılamazlar.
		// ulaşılmaya çalışılırsa compile hatası alır, runtime değil.
		for (int x = 10, y = 3; y > 3; y++) {
		}

		/*
		 * declare and initialize test loop body increment test diye gider.
		 */

		/*
		 * for looptan zorla çıkma sebepleri: break return System.exit() exception bunlar oldugunda increment kısmı çalışmaz.
		 */

		// virgülle ayırarak birden fazla increment yapılabilir.
		for (int i = 0, j = 0; (i < 10) && (j < 10); i++, j++) {
			System.out.println("i is " + i + " j is " + j);
		}

		// iterator expression içine system.out yazılabilir her body/iteration sonrası çalışır. increment yada decrement yapmasına gerek yoktur.
		int b = 3;
		for (int a = 1; b != 1; System.out.println("iterate")) {
			b = b - a;
		}

	}
}

class ForEachs{
	public static void main(String[] args) {
		int x;  
		long x2; 
		Long [] La = {4L, 5L, 6L}; 
		long [] la = {7L, 8L, 9L}; 
		int [][] twoDee = {{1,2,3}, {4,5,6}, {7,8,9}}; 
		String [] sNums = {"one", "two", "three"}; 
//		Animal [] animals = {new Dog(), new Cat()};
		// legal 'for' declarations
		for(long y : la ) ;        // loop thru an array of longs 
		for(long lp : La) ;        // autoboxing the Long objects  
		                           // into longs 
		for(int[] n : twoDee) ;    // loop thru the array of arrays 
		for(int n2 : twoDee[2]) ;  // loop thru the 3rd sub-array 
		for(String s : sNums) ;    // loop thru the array of Strings 
		for(Object o : sNums) ;    // set an Object reference to 
		                           // each String 
		                           // element
		// ILLEGAL 'for' declarations
//		for(x2 : la) ;             // x2 is already declared 
//		for(int x2 : twoDee) ;     // can't stuff an array into an int 
//		for(int x3 : la) ;         // can't stuff a long into an int 
//		for(Dog d : animals) ;     // you might get a Cat!
	}
	
}
