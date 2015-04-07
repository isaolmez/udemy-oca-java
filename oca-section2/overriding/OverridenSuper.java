package overriding;

public class OverridenSuper {
	
	public void run(int x){}
	
	public int walk(){
		return 1;
	}
	
	protected void fly(){
		System.out.println("super class fly");
	}

	public void swim()throws Exception{
		System.out.println("super class swim");
	}
	
	public void add()throws Exception{}
	
	public final void get(){}
	
	public static void set(){
		System.out.println("OverridenSuper static method");
	}
	
}
