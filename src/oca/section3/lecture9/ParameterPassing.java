package oca.section3.lecture9;

public class ParameterPassing {
	public static void main(String[] args) {
		Runner runner = new Runner();
		// Primitive parameter passing
		runner.announce();
		
		// Reference parameter passing
		runner.race();
	}
}

class Runner {
	/**
	 * Primitive Passing
	 */
	public void announce(){
		int myNum = 9;
		System.out.println("Before method, myNum: " + myNum);
		post(myNum);
		System.out.println("After method, myNum: " + myNum);
	}
	
	private void post(int num){
		num = 100;
		System.out.println("Inside method, num: " + num);

	}

	/**
	 * Reference Passing
	 */
	public void race() {
		Lane myLane = new Lane();
		System.out.println("Before method, myLane: " + myLane.number);
		run(myLane);
		System.out.println("After method, myLane: " + myLane.number);
	}

	private void run(Lane lane) {
		lane.number = 1;
		System.out.println("Inside method, lane: " + lane.number);
	}
}

class Lane {
	public int number = 0;
}