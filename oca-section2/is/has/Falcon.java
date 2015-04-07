package is.has;

public class Falcon extends Bird{

	public void eat(){
		System.out.println("falcon eat");
	}
	
	public static void main(String[] args) {
		Falcon f = new Falcon();
		System.out.println(f instanceof Falcon);
		System.out.println(f instanceof Animal);
		System.out.println(f instanceof Flying);
		System.out.println(f instanceof Bird);
		System.out.println(f instanceof Object);
		Animal a = new Falcon();
		//method tipi compile timeda referans tipine gore fakat
		//runtimeda dinamik olarak override edilmisse actual sinifa gore cagirilir
		a.eat();	
		//fly metodu cagirilimaz
		//a.fly();
		f.fly();
	
	}
}
