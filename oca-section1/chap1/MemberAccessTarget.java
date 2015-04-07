package chap1;

public class MemberAccessTarget {
	public static void main(String[] args) {
		//importa gerek yok
		MemberAccessRoot r = new MemberAccessRoot();
		r.sayi = 2;
		System.out.println(r.str);
		
		//private membera ulaþýlamaz
		
		r.sayi3 = 3;
		
		r.sayi4 = 4 ;
		
	}
}
