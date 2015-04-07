package arrays;

public class Arrays {
	public static void main(String[] args) {
		// bracket sirasi önemli degildir.
		int x[];
		int[] y;
		int xx[][];
		int[][] yy;
		int[] z[];
		int[] zz[];
		int zzz[][];

		// array referansinin boyutunu vermek lazim
		int a[] = new int[2];
		// int aa[] = new int[];

		// multidimensional arraylerde ilk dimension verilse de olur
		int[][] b = new int[2][];

		int[] c = new int[5];
		// boyle bir deger olmamasina ragmen compile timeda hata vermez,
		// runtimeda cakar
		int val = c[5];

		// 2 boyutlu arraylerde 2. boyuttaki arraylerin boyutu farkli olabilir
		int[][] q = new int[2][];
		q[0] = new int[2];
		q[1] = new int[9];

		
		for (int temp : q[0]) {
			System.out.println(temp);
		}
		
		//kisa yoldan declare, create ve initialize
		int[] d={1,2};
		
		//kisa yol ve anonymous array
		//bu durumda array boyutu verirsen compile hatasi alirsin
		int[] dd= new int[]{1,2,3,4,5};
	}
}
