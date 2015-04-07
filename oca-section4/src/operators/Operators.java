package operators;

public class Operators {
	public static void main(String[] args) {

	}
}

class CompoundOperator {
	public static void main(String[] args) {
		int x = 2;
		// bu compound assignmentın açılımı aşağıdaki gibidir
		x *= 2 + 5;
		// her zaman için sağ taraf önce yapılır ve sol tarafla işleme sokulur
		x = x * (2 + 5);
	}
}

class Comparing {
	public static void main(String[] args) {
		// değerleri aynı olduğu sürece integer ve float eşittir
		int x = 5;
		float y = 5.0F;
		System.out.println(x == y);

		// decimal point 0dan farklıysa eşit çıkmaz
		y = 5.2F;
		System.out.println(x == y);

		// bool değerlerin assignmenti ifelse içinde kullanılabilir,
		// çünkü bir assignmentin değeri sağ taraftır ve bu durumda bool
		// olacaktır
		boolean b = false;
		if (b = true)
			System.out.println("assignment ile girdi");

		if ((b = true) == true)
			System.out.println("assignmentin değeri sağ taraftır ve booleandır");
		if(false && false || true){
			System.out.println("precedence");
		}
		
		if('c' >= 'd'){
			System.out.println("character c is greater than");
		}
	}
}

class EnumEquality {
	enum CarType {
		Sedan, Coupe, Hatchbag
	}

	public static void main(String[] args) {
		CarType myType = CarType.Sedan;
		CarType yourType = CarType.Sedan;
		if (myType == yourType) {
			System.out.println("==");
		}
		if (myType.equals(yourType))
			System.out.println("equals to");
	}
}