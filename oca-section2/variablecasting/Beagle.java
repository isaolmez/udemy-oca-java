package variablecasting;

public class Beagle extends Dog implements Pet{

	//Pet classini implements demesine ragmen metodu direk yazmiyor
	//cunku Dog classi onun icin implement etti
	//eger yazarsa override etmis olacak.
	
	//implements demesine de gerek yok, zaten Beage is a Pet
	//sadece bilgilendirme amacli
	
	public static void main(String[] args) {
		//implements Pet demese de bu gecerli olacak
	}
}
