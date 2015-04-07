package interface_implemented_from_parent;


//super classta interface IMPLEMENTS etmişse instanceof true döner.
// Burada IMPLEMENTS Flying tanımını da ekleyebilirdi, ama GEREK YOK
public class BirdExtendsSuperAndDoesnotImplementInterface extends AnimalImplementsInterface{
	public static void main(String[] args) {
		BirdExtendsSuperAndDoesnotImplementInterface bird2 = new BirdExtendsSuperAndDoesnotImplementInterface();
		System.out.println(bird2 instanceof Flying);
	}
}
