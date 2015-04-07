package chap1;

public abstract class AbstractClassSuper {
	private int counter = 1;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int c) {
		this.counter = c;
	}

	public abstract void trial();

}
