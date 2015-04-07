package boxing;

public class Boxing {

	public static void main(String[] args) {
		Integer y = new Integer(567); // make it
		y++; // unwrap it, increment it,
				// rewrap it
		System.out.println("y = " + y); // print it

		// Wrapper objeler immutable yani değiştirilemez, değiştirildiğinde yeni
		// obje yaratılır
		Integer yy = 567; // make a wrapper
		Integer x = yy; // assign a second ref
						// var to THE wrapper
		System.out.println(yy == x); // verify that they refer
										// to the same object
		yy++; // unwrap, use, "rewrap"
		System.out.println(x + " " + yy); // print values
		System.out.println(yy == x); // verify that they refer
										// to different objects

		// == operatoru belirli sınırlar dışında normal davranır.
		// !!! Boxing olması lazım, developer Integer objesi yaratmıyor,
		// compiler boxing yapıyor
		Integer i1 = 1000;
		Integer i2 = 1000;
		if (i1 != i2)
			System.out.println("different objects");
		if (i1.equals(i2))
			System.out.println("meaningfully equal");

		// Fakat aşağıdakiler için aynı şey geçerli değil
		// Boxing yapması lazım
		Integer a = 10;
		Integer b = 10;
		// a==b true döner
		if (a == b)
			System.out.println("a and b are equal");
		else
			System.out.println("a and b are NOT equal");

		// Kendin Integer objesi yaratırsan yine false olur, referanslar aynı
		// değil
		Integer a2 = new Integer(10);
		Integer b2 = new Integer(10);
		// a==b true döner
		if (a2 == b2)
			System.out.println("a2 and b2 are equal");
		else
			System.out.println("a2 and b2 are NOT equal");

		// boolean, bytelar için geçerli
		// -128den 127e kadar olan short ve integer için geçerli
		// 0dan 127e kadar olan characterler için geçerli

		Boolean bo = true;
		Boolean bo2 = true;
		if (bo == bo2)
			System.out.println("bo and bo2 are equal");
		else
			System.out.println("bo and bo2 are NOT equal");

	}
}
