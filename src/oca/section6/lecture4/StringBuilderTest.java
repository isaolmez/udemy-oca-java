package oca.section6.lecture4;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc"); // Initialize sb
		System.out.println(sb);
		sb.append("xyz").insert(4, "123"); // Modify the value of sb. Append then insert.
		System.out.println(sb);

		
		String s = "abc";
		s = s.concat("xyz");
		String sub = s.substring(4);
		s = s.replaceFirst(sub, "123" + sub);
		System.out.println(s);
		/**
		 * "abc", "xyz", "abcxyz", "yz", "123", "123yz" have been abondoned.
		 */
		
		
		/**
		 * Methods can be chained.
		 */
		sb = new StringBuilder();
		sb.append(123).append("aaa").insert(3, "klm");
		System.out.println(sb);
		
	}
}
