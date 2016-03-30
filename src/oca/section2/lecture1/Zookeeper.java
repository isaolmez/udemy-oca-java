package oca.section2.lecture1;

public class Zookeeper {
	void measureDeer(Deer deer) {
		int oldWeight = deer.getWeight();
		deer.weight = oldWeight + 10; // Do not access directly. Use setWeight() instead!
	}
}

class Deer {
	public int weight; // Dont allow direct access to variable

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}