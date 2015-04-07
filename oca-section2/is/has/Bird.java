package is.has;

public class Bird extends Animal implements Flying{

	public void eat(){
		System.out.println("bird eat");
	}

	//public access modifier konulmasi gerekiyor
	//interfacede public yazmasa da implicitly public abstract
	public void fly(){
		System.out.println("flying");
	}
	
	public static void main(String[] args) {
		Animal a = new Bird();
		Flying f = new Bird();
		Bird b = new Bird();
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Bird);
		System.out.println(f instanceof Bird);
		System.out.println(b instanceof Animal);
		System.out.println(b instanceof Flying);
		
	}
}
