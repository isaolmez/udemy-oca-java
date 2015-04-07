package chap1_out;

public class MemberAccessInheritanceSub3 extends MemberAccessInheritanceSub2{

	void deneme(){
		pub = pro;
		//public ve protected elemanlara ulaşıldı
		
		MemberAccessInheritanceSub2 sub2 = new MemberAccessInheritanceSub2();
		sub2.pub = 2 ;
		//super classtaki protected member inheritance yoluyla gelmesine 
		//kar��n instance yoluyla al�n�rken kayboldu
		//��nk� protected eleman inheritancedan gelmi�ti ve art�k private gibi davran�yor
		//farkl� paketten extend edince protected private gibi davran�yor.
		//aynı paketteki classlar inherited protected membera ulaşamıyor.
	}
}
