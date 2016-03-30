package oca.section3.lecture8;

public class InitTest2 {
	int[] myArr = new int[3];
	String[] strArr = new String[3];
	float[] floArr = new float[3];

	public static void main(String[] args) {
		InitTest2 test = new InitTest2();
		for (int i : test.myArr) {
			System.out.println(i);
		}
		for (String s : test.strArr) {
			System.out.println(s);
		}
		for (float f : test.floArr) {
			System.out.println(f);
		}
	}
}
