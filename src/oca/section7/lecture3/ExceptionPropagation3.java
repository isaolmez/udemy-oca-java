package oca.section7.lecture3;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionPropagation3 {
	public static void main(String[] args) {
		run();
		System.out.println("Ran.");
	}

	static void run() {
		try {
			warmUp();
		} catch (IOException e) {
			System.out.println("Catched and handled the exception!");
		}
	}

	static void warmUp() throws IOException {
		FileReader reader = new FileReader("Warming Guide");
		reader.close(); // NO book named "Warming Guide", throws exception
		System.out.println("Read Warming Guide!");
	}
}
