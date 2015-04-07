package chap2;

public class BasicsSub extends BasicsSuper{
	
	public int y = 3;
	
	@Override
	public void print() {
		System.out.println("sub class " + 3);
	}
	
	public static void deneme(BasicsSuper s){
		System.out.println(s.getClass().toString());
		
	}
	public static void main(String[] args) {
		BasicsSuper s = new BasicsSuper();
		BasicsSuper s2 = new BasicsSub();
		s.print();
		s2.print();
		//compile timeda sadece referans tipinin metotlarýna izin var 
		//fakat runtimeda actual objenin metotu cagirilir, eger override edilmiþse
		
		deneme(s);
		deneme(s2);
		//inheritance tree uzerinde oldugu icin basicssub da kabul edildi
		//fakat actual objenin override edilmiþ metotu cagirildi
			
	}
	
	
}
