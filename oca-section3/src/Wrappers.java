
public class Wrappers {
	public static void main(String[] args) {
		//char/Character haric 2 constructor vardir
		//string ve kendi tipini alir
		Integer i = new Integer(1);
		Integer ii = new Integer("1");
	
		//Wrapper classlar char ve int haric buyuk harflere cevrilmis halleridir
		Float f = new Float(2);
		
		//valueOf da wrapper obje yaratir
		Integer i1 = Integer.valueOf(123);
		Integer i2 = Integer.valueOf("123");
		
		//parseXXX ise primitive doner
		int i3 = Integer.parseInt("1");
		
		//instance metodu toString()
		System.out.println(i1.toString());
		
		//static toString() metodu
		System.out.println(Integer.toString(1232));
		
		//radixli toString() metodu
		//int ve long ta var
		System.out.println(Integer.toString(2,2));
		
	}
}
