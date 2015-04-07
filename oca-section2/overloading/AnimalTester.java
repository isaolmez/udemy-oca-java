package overloading;

public class AnimalTester {

	//overloaded ve overriding bir arada
	public static void main(String[] args) {
		Animal a = new Animal();
		Horse h = new Horse();
		Animal ah = new Horse();
		AnimalTester at = new AnimalTester();
		//compile timeda referans tipine gore karar verecel
		//horse objesine point etse de referans animal oldugu icin ilk metot cagirilacak
		//fakat metot icinde gercek obje horse oldugu icin horse'un override ettigi eat metodu calisacak
		at.method1(ah);
	}
	
	public void method1(Animal a){
		System.out.println("animal method");
		a.eat();
	}
	
	public void method1(Horse h){
		System.out.println("horse method");
		h.eat();
	}
	
}
