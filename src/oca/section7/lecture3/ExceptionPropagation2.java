package oca.section7.lecture3;

import java.util.Date;

public class ExceptionPropagation2 {
	public static void main(String[] args) {
		wakeUp();
		System.out.println("Woke up");
	}

	static void wakeUp() {
		try {
			eatBreakfast();
		} catch (Exception e) {
			System.out.println("Catched and handled the exception!");
		}
		System.out.println("Ate breakfast");
	}

	static void eatBreakfast() {
		Date d = null;
		d.getTime(); // throws NullPointerException
	}
}
