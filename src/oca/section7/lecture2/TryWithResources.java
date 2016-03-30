package oca.section7.lecture2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources {

	static void readFromFile(String path) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			reader.readLine();
		}
	}

	static void readFromFileWithFinallyBlock(String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		try {
			reader.readLine();
		} finally {
			if (reader != null)
				reader.close();
		}
	}

	public static void getCount(Connection con) throws SQLException {
		String query = "select count(*) as student_count from students";

		try (Statement statement = con.createStatement()) {
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				int count = rs.getInt("student_count");
				System.out.println(count);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
