package overriding;

import java.io.IOException;

public class OverridingSub extends OverridenSuper{

	//override olmaz cunku parametre sayisi ve tipi farkli
	public void run(int x, int y){}
	
	//return type superdekinden farkli olamaz
	//overload da degil cunku parametre listesi degismemis
	//overload olmasi icin parametre listesi KESINLIKLE DEGISECEK
//	public long walk(){
//		return 1;
//	}
	
	//daha genis bir access modifier kullanilabilir ama tersi dogru degil
	public void fly(){
		System.out.println("sub class fly");
	}

	//super classtaki checked exceptionin subclassi bir exception atabilir
	//yeni bir unchecked yani runtime exception atabilir
	public void swim()throws IOException, RuntimeException{
		System.out.println("sub class swim");
	}
	
	//tamamen exceptionlari kaldirabilir
	public void add(){}
	
	//cannot override final methods
	//public final void get(){}
	
	//static metotlar override edilemez cunku inherit edilemezler
	public static void set(){
		System.out.println("OverridingSub static method");
	}
	
	public static void main(String[] args) {
		
		OverridenSuper superClassReference = new OverridingSub();
		//subclasstaki run metodunu gormedi
		superClassReference.run(1);
		superClassReference.fly();
		//referans tipi super classa ait oldugu icin compile time hatasi veriyor
		//runtimeda dinamik olarak sub classin versiyonunu cagiracak olsa da compileda hata aliyor
//		overridenSuper.swim();
//		overridenSuper.add();
		//referans tipi super class oldugu icin super classin static metodunu cagiriyor
		superClassReference.set();
		
		OverridingSub sub = new OverridingSub();
		//bu sefer subclassin static metodu cagiriliyor
		sub.set();
		
		
	}
}
