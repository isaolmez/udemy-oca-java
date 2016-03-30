package oca.section7.lecture5;

import java.io.IOException;

public class HandleOrDeclare {
	public static void main(String[] args) throws IOException {
		riskyMethod();
	}

	static void riskyMethod() throws IOException {
		throw new IOException(); // throw an checked exception.
	}

	// 1st option
	static void useRiskyWithHandle() {
		try {
			riskyMethod();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2nd option
	static void useRiskyWithDeclare() throws IOException {
		riskyMethod();
	}
}


