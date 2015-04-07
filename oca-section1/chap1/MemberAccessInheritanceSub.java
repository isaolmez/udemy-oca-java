package chap1;

import chap1_out.MemberAccessInheritanceSub2;

public class MemberAccessInheritanceSub extends MemberAccessInheritanceSuper {

		public void tryIt(){
			pub=pro+def;
			//private membera ulaşamıyor
			MemberAccessInheritanceSuper super1 = new MemberAccessInheritanceSuper();
			super1.def = super1.pro + super1.pub;
			
		}
		
		public static void main(String[] args) {
			// Call another subclass in another package
			MemberAccessInheritanceSub2 sub2 = new MemberAccessInheritanceSub2();
			sub2.pro++;
		}
}
