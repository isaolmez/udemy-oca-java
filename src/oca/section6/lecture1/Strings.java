package oca.section6.lecture1;

public class Strings {
	public static void main(String[] args) {
		String s = new String();
		s = "ab";

		String temp = s;

		s = s.concat("cd");
		s = s.toUpperCase();

		System.out.println("s: " + s);
		System.out.println("temp: " + temp);
	}

	static void craeteStrings() {
		String str = new String();
		str = "abcd";

		String str2 = new String("abcd");

		String str3 = "abcd";
	}
}
