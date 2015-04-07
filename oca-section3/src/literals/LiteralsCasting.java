package literals;

public class LiteralsCasting {
	public static void main(String[] args) {

		// implicit cast
		byte a = 12;
		
		//implicit cast
		byte b = 2;
		
		//burada implicit cast yapmaz, cunku implicit casti deger limitler icindeyse yapar
		//burada limiti astigini bilemez. limit dahilinde olsa da explicit cast ister
		//!!! int veya daha kucuk tipleri toplami carpimi her zaman inttir.
		//byte+byte = int
		byte c = (byte)(a + b);

		c = (byte)(a+4);
		//burada degisken icin icine girmedigi icin degeri biliyor limit icinde diyor ve implicit cast uyguluyor
		byte d = 3 + 4;
		
		//limiti astigi icin explicit cast
		byte e = (byte)(120+30);
		
		
		
		int aa = 1;
		//variable isin icine girdigi icin degeri hesaplayamiyor ve explicit cast
		byte f = (byte)aa;
	}
}
class DoubleCasting{
	public static void main(String[] args) {
		float f = 12.1F;
		float ff = 12.2F;
		
		//float da tam intlere gore tam tersi basta literali floata cast etmen sart, compiler implicit yapmiyor 
		//ama daha sonra islem sirasinda intteki double olur diyip tekrar cast istemiyor
		float fff = f + ff;
	}
}
