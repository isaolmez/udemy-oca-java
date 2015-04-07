package interface_implemented_from_parent;


//super classta interface metot oldugu icin IMPLEMENTS demesine ragmen metodu doldurmuyor
//rastgeke metot aynı oluyor ama interface implement etmiş muamelesi görüyor
public class BirdExtendsSuperWithInterfaceMethod extends AnimalwithInterfaceMethod implements Flying{
	public static void main(String[] args) {
		BirdExtendsSuperWithInterfaceMethod bird2 = new BirdExtendsSuperWithInterfaceMethod();
		System.out.println(bird2 instanceof Flying);
	}
}
