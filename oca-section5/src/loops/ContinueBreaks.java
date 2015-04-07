package loops;

public class ContinueBreaks {
	public static void main(String[] args) {
		// continue denilse de iteration cümlesi çalışır.
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside loop");
			continue;
		}

		//break outer; dediğin zaman outer labelina sahip fora break atar veya continue atar
		boolean isTrue = true;
		outer: for (int i = 0; i < 5; i++) {
			while (isTrue) {
				System.out.println("Hello");
				break outer;
			} // end of inner while loop
			System.out.println("Outer loop."); // Won't print
		} // end of outer for loop
		System.out.println("Good-Bye");

		
		//continue örneği
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Hello");
				continue outer;
			} // end of inner loop
			System.out.println("outer"); // Never prints
		}
		System.out.println("Good-Bye");

	}
}
