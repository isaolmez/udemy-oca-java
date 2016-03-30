package oca.section2.lecture10;

public class ConstructorTest {
	public static void main(String[] args) {
		OCA oca = new OCA();
	}
}

class OCA extends Certification {
	private int questionCount = getQuestionCount();
	private int totalTime = 120;

	public OCA() {
		System.out.println("OCA constructor.");
	}
	
	public int getQuestionCount(){
		System.out.println("Setting OCA instance variable.");
		return 70;
	}
}

class Certification {
	public Certification() {
		System.out.println("Certification constructor.");
	}
}