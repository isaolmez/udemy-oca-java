package literals;

public class CompoundAssignment {

	public static void main(String[] args) {
		byte a = 1;
		//explicit cast beklersin cunku degisken toplami var ama acilimi soyle
		a += 1;
		a =+ 1;
		//+=*= vb. her zaman implicit cast koyar
		a = (byte)(a+1);
	}
}
