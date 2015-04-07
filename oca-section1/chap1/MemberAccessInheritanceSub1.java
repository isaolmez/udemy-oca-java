package chap1;

public class MemberAccessInheritanceSub1 extends MemberAccessInheritanceSub{

	void deneme(){
		def = pro + pub;
		//private haric memberlara ula��l�yor.
		
		MemberAccessInheritanceSub sub = new MemberAccessInheritanceSub();
		sub.def = sub.pro + sub.def + sub.pub;
		//protected veya default accesse sahip memberlar ayn� paketteki classlar taraf�ndan 
		//extend edilirse protected ve default access memberlar di�er classlar taraf�ndan da 
		//instance yoluyla g�r�n�yor. Hem inheritance hem de instance yoluyla.
		//D�� paketteki subclasslarda ise protected memberlar instance yoluyla ula��lam�yor.
		//Esas�nda mant�kl�. Neden?
		//default member zaten paket d���na ��kam�yor, protected member inheritance yoluyla 
		//gidiyor ama esas�nda bir pakete A�TT�R. instance yoluyla subclasstan eri�ilmesi yanl��.
	}
}
