package constructor;

public class Order {

	String str = printString();
	
	{
		System.out.println("block enter:" + str);
		str = "deneme";
		System.out.println("block exit:" + str);
	}
	
	public Order() {
		System.out.println("constructor enter: " + str);
		System.out.println("constructor");
	}

	String printString(){
		System.out.println("instance variable is set to: print");
		return "print";
	}
	public static void main(String[] args) {
		new Order();
	}
}
