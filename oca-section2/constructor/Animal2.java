package constructor;

public class Animal2 {
	int i = 0;
	Animal2(){
		//super cagirilmadan instance metodunu yada degiskenini cagiramaz
		//static method veya degisken cagirabilirsin
		//this(getValue());
		//this(i);
		this(getValueStatic());
	}
	Animal2(int i){
		System.out.println(i);
	}
	
	int getValue(){
		return 1;
	}
	static int getValueStatic(){
		return 1;
	}
	public static void main(String[] args) {
		new Animal2();
	}
}
