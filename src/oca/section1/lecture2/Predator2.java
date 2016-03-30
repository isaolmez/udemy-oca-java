package oca.section1.lecture2;

abstract class Predator2 {
	private double weight;
	private String species;

	public abstract void hunt();

	public abstract void chase();

	public void roar() {
		System.out.println("Roarrr");
	}
}
