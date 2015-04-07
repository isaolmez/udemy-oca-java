package literals;

public class IntegerLiterals {

	public static void main(String[] args) {

		
		//her sayi literali implicit olarak int tir
		int i = 12;
		
		// largest int
		int ii = 2147483647;
		// int iii = (int)2147483648;//int boyutunu asar explicit cast de ise
		// yaramaz

		// sayi literalleri implicit olarak int olmasina ragmen compiler cast
		// koyar
		// implicit cast de byte limitleri icinde ise yarar, disindaysa explicit
		// cast ister
		byte b = 12;

		// largest byte
		byte bb = 127;

		// byte boyutunu asar, explicit cast ister
		byte bbb = (byte) 128;

		// implicit cast by compiler
		short s = 12;

		// largest short number
		short ss = 32767;

		// explicit cast ister
		short sss = (short) 32768;

		char c = 'a';
		
		//implicit cast
		//char aslinda 16 bit integer degerleri alabilir
		char cc = 12;
		
		//largest char
		char ccc = 65535;
		
		//explicit cast
		char cccc = (char)66000;
		
		//unicode degeri
		char c1 = '\u3332';
		
		//!!!
		//long intin alabilecegi her degeri tutabilecegi icin explicit caste gerek yoktur
		//buyuk degeri kucuk tipe atarken explicit cast gerekir ama int veya altinda bunu compiler implicit yapar. 
		//degisken kullanilmadiysa literal kullanildiysa
		//genel kuralin disina cikan bir kisayoldur bu, compiler kiyak gecer, kendi limitler icinde mi diye kontrol eder sonra implicit cast uygular.
		//limit disindaysa explicit castten kacar yok
		//floatlarda bunu yapmaz mesela
		long l = 12;
		
		long ll = 12L;
		
		
		//int tipi long degerini tutamayacagi icin explicit cast gerekir.
		//ayrica sona L koydugu icin long gibi gorup cast istedi, long tipinde bir degisken olmamasina ragmen
		int narrowing = (int)12L;
		
		//short largest int tutamasina ragmen explicit cast oluyor ve runtime hatasi da almaz
		//sonuc sacma olur
		short narrowing2 = (short)2147483647;
		
	}
}

class OctalsHexs {

	public static void main(String[] args) {

		// decimal
		int i = 12;
		System.out.println(i);

		// octal
		int ii = 012332;
		System.out.println(ii);

		// hexadecimal
		int iii = 0x11222aa;
		System.out.println(iii);

	}
}

class FloatsDoubles{
	
	public static void main(String[] args) {
		//her ondalikli literal implicit olarak 
		//ondalikli sayilar noktayla ayrilir
		
		double d = 12.3;
		
		//hata alir, explicit cast veya sona F konmasi gerekir
		//float f = 12.3;
		float f = 12.3F;
		float ff = 12.3f;
		float fff = (float)12.3;
		
	}
	
	
}