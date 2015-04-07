package initblocks;

public class Animal extends Super {
	public int i = 5;
	// her obje yaratildiginda cagirilir
	// init blocklarin sirasi onemlidir, yukaridan asagi cagirilir
	{
		System.out.println("instance init block 1: " + i);
		i = 11;
		System.out.println("instance init block 1: " + i);
	}
	{
		i = 22;
		System.out.println("instance init block 2: " + i);
	}

	// class JVM tarafindan load edildigi zaman cagirilir
	static {
		System.out.println("static init block 1");
	}
	static {
		System.out.println("static init block 2");
	}

	Animal() {
		System.out.println("constructor: " + i);
	}

	public static void main(String[] args) {
		new Animal();
	}
}

class Super {
	public int i = 0;
	Super()
	{
		System.out.println("super constructor: " + i);
	}
}