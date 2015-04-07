package Strings;

public class Strings {
	public static void main(String[] args) {
		//string literal pooldan aldığı için ikisi de aynı yere objeye point eder
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		//new dediği için normal memoryde 2 farklı obje yaratılır ve onlara point edilir.
		String s3 = new String("def");
		String s4 = new String("def");
		String s41 = "def";
		System.out.println(s3==s4);
		System.out.println(s4==s41);
		System.out.println(s4.equals(s41));
		
		String s5 = new String("abc");
		System.out.println(s1==s5);
		
		
		String x = "big surprise";
		System.out.println( x.toString() );
	}
}
