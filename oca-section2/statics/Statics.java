package statics;

public class Statics {
	public static void main(String[] args) {
		//static metotlar override edilmedigi icin referans tipine yani class tipine gore cagirilir.
		Animal a = new Bird();
		a.go();
		
		// static metotlar override edilmese de inherit ediliyor!!!
		Bird b = new Bird();
		b.go();
		
		Cat c = new Cat();
		c.go();
	}
	
}
class Animal{
	static void go(){
		System.out.println("Animal");
	};
}
//static methodlar override edilemez
class Bird extends Animal{
	static void go(){
		System.out.println("Bird");
	};
}

class Cat extends Animal{
}