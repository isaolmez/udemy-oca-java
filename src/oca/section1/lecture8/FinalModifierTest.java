package oca.section1.lecture8;

import oca.common.Student;

public class FinalModifierTest {
	final int creditLimit = 20;
	final Student student = new Student();
	final int courseCount;

	public FinalModifierTest() {
//		creditLimit = 25;
		student.setName("constructor");
//		student = new Student();
		courseCount = 6;
//		courseCount = 8;
	}
	
	public void	modify(){
//		creditLimit = 25;
//		courseCount = 6
		student.setName("modify");
	}
}
