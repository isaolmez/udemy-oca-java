package variablecasting;

public class DownUpCasting {

	public static void main(String[] args) {
		Dog d = new Beagle();
		//downcasting
		Beagle b = (Beagle)d;
		//upcasting
		Dog dd = new Beagle();
		
		Dog wa = new Dog();
		Beagle bb = (Beagle)wa;
	}
}
