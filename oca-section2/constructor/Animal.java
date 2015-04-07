package constructor;

public class Animal {
	
	//1) super callu oldugu icin instance method cagirilabilir
	Animal(){
		System.out.println(getValue());
	}
	
	int getValue(){
		return 1;
	}
	public static void main(String[] args) {
		new Animal();
		//2) bird constructori cagirilinca once super sonra kendi constructori cagirilir
		new Bird();
	}
}
class Bird extends Animal{
	Bird(){
		System.out.println("Bird");
	}
}
