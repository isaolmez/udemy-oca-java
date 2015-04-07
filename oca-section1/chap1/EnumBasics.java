package chap1;

enum yas{GENC, YASLI}
class Deneme{
	protected enum hiz{HIZLI, YAVAS}
	//bu enuma ula�mak i�in tan�mland�g� class isminin de eklenmesi gerekir.
	
}
public class EnumBasics {
	enum boy{TALL, GRANTE, VENTi}
	enum mevsim{summer,fall,autumn,spring}
	enum AdvancedEnum {
		HIZLI(2), YAVAS(1){
			public String getMessage(){
				return "slow";
			}
		};
		AdvancedEnum(int hiz){
			this.hiz=hiz;
			
		}
		private int hiz;
		public int getHiz(){
			return hiz;
		}
		public String getMessage(){
			return "fast";
		}
	}
	static AdvancedEnum h1;
	
	public static void main(String[] args) {
//		enum method{metoticiolmaz}
		AdvancedEnum h2 = null;
		AdvancedEnum h3 = h2.HIZLI;
		yas y;
		int x = h3.getHiz();
		int xx = AdvancedEnum.HIZLI.ordinal();
		System.out.println(boy.GRANTE);
		System.out.println(yas.GENC);
		System.out.println(Deneme.hiz.HIZLI);
		System.out.println(AdvancedEnum.HIZLI.getHiz());
		System.out.println(mevsim.autumn.name());
		System.out.println(AdvancedEnum.YAVAS.getMessage());
	}
	
	
}
