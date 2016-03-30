package oca.section3.lecture2;

public class IntegerLiterals {

	public static void main(String[] args) {
		// Decimal Literals
		int n1 = 15;
		int n2 = 10204;
		byte n3  = 42;
		System.out.println(n1 + "\t" + n2 + "\t" + n3 );
		
		// Octal Literals
		int on1 = 017;
		int on2 = 023734;
		byte on3 = 052;
		System.out.println(on1 + "\t" + on2 + "\t" + on3 );
		
		
		// Hexadecimal Literals
		int hn1 = 0xF;
		int hn2 = 0x27DC;
		byte hn3 = 0x2A;
		System.out.println(hn1 + "\t" + hn2 + "\t" + hn3 );
	}
}
