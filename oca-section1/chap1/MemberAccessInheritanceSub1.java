package chap1;

public class MemberAccessInheritanceSub1 extends MemberAccessInheritanceSub{

	void deneme(){
		def = pro + pub;
		//private haric memberlara ulaþýlýyor.
		
		MemberAccessInheritanceSub sub = new MemberAccessInheritanceSub();
		sub.def = sub.pro + sub.def + sub.pub;
		//protected veya default accesse sahip memberlar ayný paketteki classlar tarafýndan 
		//extend edilirse protected ve default access memberlar diðer classlar tarafýndan da 
		//instance yoluyla görünüyor. Hem inheritance hem de instance yoluyla.
		//Dýþ paketteki subclasslarda ise protected memberlar instance yoluyla ulaþýlamýyor.
		//Esasýnda mantýklý. Neden?
		//default member zaten paket dýþýna çýkamýyor, protected member inheritance yoluyla 
		//gidiyor ama esasýnda bir pakete AÝTTÝR. instance yoluyla subclasstan eriþilmesi yanlýþ.
	}
}
