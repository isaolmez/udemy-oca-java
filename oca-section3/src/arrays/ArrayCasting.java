package arrays;

public class ArrayCasting {
	public static void main(String[] args) {
		
		//BOYUTLAR
		int[] a = new int[2];
		int[] b = new int[9];
		int[][] cc = new int[2][];
		int[][] dd = new int[3][];
		//boyut indexi farkli olsada assign edilir, ama boyutu ayni olmasi lazim
		a=b;
		cc=dd;
		//olmaz boyut sayisi farkli
		//a=cc;
		
		//ARRAY DEGERLERI
		//1- int arrayine char atilabilir
		char ch = 'a';
		a[0] = ch;
		
		
		//2- nesnelerde de subclasslar atilabilir
		
		
		//ARRAY REFERANS ATANMASI
		char[] c = new char[2];
		//1- char inte cast edilse de char arrayi int arrayine assign edilemez
		//a = c;
		
		
		//2- !!!!ama nesnelerde subclass arrayi super class arrayine assign edilir
		
	}
}
