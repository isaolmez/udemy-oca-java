package oca.section1.lecture6;

public class StrictfpTest {
	public strictfp float calculateSalary(float baseSalary){
		float result = baseSalary * 1.5F + 0.215F * 1100;
		return result;
	}
}
