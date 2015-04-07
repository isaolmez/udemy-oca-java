package boxing;

public class WideningBoxingVarargs {
	static void go(int x) {
		System.out.print("int ");
	}

	static void go(long x) {
		System.out.print("long ");
	}

	static void go(double x) {
		System.out.print("double ");
	}

	// Widening Primitives/Wrappers
	public static void main(String[] args) {
		byte b = 5;
		short s = 5;
		long l = 5;
		float f = 5.0f;
		// byte inte widen olur, çünkü ona en yakın küçük type o
		go(b);
		// short inte widen olur, çünkü ona en yakın küçük type o
		go(s);
		// long kendi metodunu çağırır
		go(l);
		// float doublea widen olur
		// SADECE double metodu olsaydı, bütün 4 ü doublea widen olurdu
		go(f);
	}

}

// Overloaded metotlarda Boxing ve Varargs Sırası
class OverloadingWithBoxingandVarargs {

	static void go(Integer x) {
		System.out.println("Integer");
	}

	static void go(long x) {
		System.out.println("long");
	}

	static void run(int x, int y) {
		System.out.println("int,int");
	}

	static void run(byte... x) {
		System.out.println("byte... ");
	}

	static void walk(Byte x, Byte y) {
		System.out.println("Byte, Byte");
	}

	static void walk(byte... x) {
		System.out.println("byte... ");
	}

	public static void main(String[] args) {
		int i = 5;
		/*
		 * 1- Compiler wideningi boxinge tercih eder. Neden tercih eder peki???
		 * Oda eskiden var olan feature yeni gelen tarafından ezilmesin. eski
		 * kod çalışmaya devam etsin diye.
		 */
		go(i);

		/*
		 * 2- Compiler wideningi varargsa tercih eder
		 * 
		 * widening boxing ve var-args ı ezer. ikisine de uyan overloaded metot
		 * varsa widening kullanan metot çağırılır.
		 */
		byte b = 5;
		run(b, b);

		/*
		 * 3- Boxing Varargsı ezer, compiler boxing yapan metodu tercih eder
		 */
		byte c = 5;
		walk(c, c);
	}

}

// Widening Reference Variables
class Animal {
	static void eat() {
	}
}

class Dog3 extends Animal {
	public static void main(String[] args) {
		Dog3 d = new Dog3();
		// Dog is widened to Animal
		d.go(d); // is this legal ?
	}

	void go(Animal a) {
	}
}

// Wrapperlar mesela Integer Longa widen olmaz
class Dog4 {
	public static void main(String[] args) {
		Dog4 d = new Dog4();
		// d.test(new Integer(5)); // can't widen an Integer
		// to a Long
	}

	void test(Long x) {
	}
}


class Vararg {
	static void wide_vararg(long... x) {
		System.out.println("long...");
	}

	static void box_vararg(Integer... x) {
		System.out.println("Integer...");
	}
	
	static void wide_vararg(Long... x) {
		System.out.println("Long...");
	}


	public static void main(String[] args) {
		int i = 5;
		wide_vararg(5, 5); // needs to widen and use var-args
		box_vararg(5, 5); // needs to box and use var-args
		//boxing varargsı ezer ama ikisi de varargsa widening boxingi ezer.
		wide_vararg(5,5);
	}
}
