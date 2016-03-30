package oca.section3.lecture14;

import oca.common.Student;

public class GarbageTest3 {
	public static void main(String[] args) {
		Student student = getStudent();
	}

	public static Student getStudent() {
		Student s = new Student();
		StringBuilder info = new StringBuilder(s.toString());
		return s;
	}
}
