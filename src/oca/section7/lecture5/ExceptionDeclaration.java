package oca.section7.lecture5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionDeclaration {
	
	/**
	 * SQLException related declarations
	 */
	static void connect() throws SQLException {
		DriverManager.getConnection("jdbc:mysql://localhost/test");
	}

	static void connect2() throws Exception {
		DriverManager.getConnection("jdbc:mysql://localhost/test");
	}

	static void connect3() throws Throwable {
		DriverManager.getConnection("jdbc:mysql://localhost/test");
	}

	static void connect4() throws SQLException, NullPointerException {
		DriverManager.getConnection("jdbc:mysql://localhost/test");
	}
	
	/**
	 * FileNotFoundException related declarations
	 */
	static void read() throws FileNotFoundException {
		FileReader reader = new FileReader("test");
	}
	
	static void read1() throws IOException {
		FileReader reader = new FileReader("test");
	}

	static void read2() throws Exception {
		FileReader reader = new FileReader("test");
	}

	static void read3() throws Throwable {
		FileReader reader = new FileReader("test");
	}
	
}
