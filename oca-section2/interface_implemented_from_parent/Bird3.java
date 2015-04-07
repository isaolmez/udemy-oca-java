package interface_implemented_from_parent;

//super classta interface metodu rastgele varsa ve IMPLEMENTS demişse instanceof true döner, 
//eğer metot var fakat IMPLEMENTS dememişse instanceof false döner
public class Bird3 extends AnimalwithInterfaceMethod{
	public static void main(String[] args) {
		Bird3 bird2 = new Bird3();
		System.out.println(bird2 instanceof Flying);
	}
}
