package chap1_out;

import chap1.MemberAccessRoot;

public class MemberAccessTarget2 {
	public static void main(String[] args) {
		MemberAccessRoot r = new MemberAccessRoot();
		r.sayi=1;
		r.str="";
		
		//protected, default ve private memberlara ulaþýlamaz.
	}
}
