package chap1_out;

import chap1.MemberAccessInheritanceSuper;

public class MemberAccessInheritanceSub2 extends MemberAccessInheritanceSuper{
	
	void tryIt(){
		pub = pro;
		//default ve private memberlar eriþilemedi
		
		
		MemberAccessInheritanceSuper parent = new MemberAccessInheritanceSuper();
		parent.pub=2;
		//protected member da instance ile ulaþýnca gitti
		
		//artık protected aynı pakettekiler tarafından çağırılır
		int pro2 = new MemberAccessInheritanceSub2().pro;
	}
	public static void main(String[] args) {
		//bu da sadece kendi içinden kendi instanceını yarattıgı için protecteda ulaşıyor.
		int pro2 = new MemberAccessInheritanceSub2().pro;
		//bu olmaz
//		new MemberAccessInheritanceSuper().pro;
	}
}
