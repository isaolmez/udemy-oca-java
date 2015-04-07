package variablepassing;

public class VariablePassing {

	void changeIt(int a){
		a = 100;
	}
	void changeIt(Bar b){
		b.barNum = 12;
	}
	public static void main(String[] args) {
		VariablePassing v = new VariablePassing();
		int i = 1;
		v.changeIt(i);
		//primitive degiskenlerin degeri degismez cunku metota degiskenin kopyasi gider. 
		//primitivelerde deger degiskende oldugu icin 2 degiskenin hiçbir baglantisi yoktur.
		System.out.println(i);

		
		//obje referanslarinda obje statei degisebilir ama referansin refer ettigi obje degismez.
		//kopyalan degiskenle orjinal ayni nesneye refer eder.
		// metottaki baska bir nesneye refer ederse veya null yaparsa, baglantilari kalmaz
		Bar b = new Bar();
		v.changeIt(b);
		System.out.println(b.barNum);
	}
}

//Variable passing with shadowing
class Foo1 {
	static int size = 7;
	
	//normalde size static oldugu icin degismesi gerekir ama 
	//parametre olan size onu shadowluyor ve local variable islemi oluyor.
	static void changeIt(int size) {
		size = size + 200;
		System.out.println("size in changeIt is " + size);
	}

	public static void main(String[] args) {
		Foo1 f = new Foo1();
		System.out.println("size = " + size);
		changeIt(size);
		System.out.println("size after changeIt is " + size);
	}
}

class Bar {
	int barNum = 28;
}

class Foo {
	Bar myBar = new Bar();

	void changeIt(Bar myBar) {
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
		//farkli bir nesneye refer ediyor burda baglanti kopuyor
		myBar = new Bar();
		myBar.barNum = 420;
		System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
	}

	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);
		f.changeIt(f.myBar);
		System.out
				.println("f.myBar.barNum after changeIt is " + f.myBar.barNum);
	}
}