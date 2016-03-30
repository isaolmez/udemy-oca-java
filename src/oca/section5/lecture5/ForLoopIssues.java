package oca.section5.lecture5;


public class ForLoopIssues {
	public static void main(String[] args) {
//		endlessLoop();
//		endlessLoop2();
//		actLikeWhile();
//		variableScope();
		doWeirdThings();
	}

	public static void endlessLoop() {
		for (;;) { // no declaration part were filled
			System.out.println("Endless loop");
		}
	}

	public static void endlessLoop2() {
		for (int i = 0;  ; i++) {
			System.out.println("Endless loop: " + i);
		}
	}

	public static void actLikeWhile() {
		int i = 0;
		for (; i < 3;) {
			System.out.println("i: " + i++);
		}
	}
	
	public static void variableScope(){
		for (int i = 0; i < 3; i++) {
			System.out.println("i: " + i);  // Can access
		}
//		System.out.println("Cannot access i: " + i); // Compiler error.
		
		int a;
		for (a = 0; a < 3; a++) {
			System.out.println("a: " + a); // Can access
		}
		System.out.println("Can access a: " + a);  // Can access
	}
	
	public static void operateOnDifferentVars(){
		int x = 0;
		int y = 0;
		for (int i = 0; x++ < 3; y++) {
			System.out.println("hi");
		}
	}
	
	public static void doWeirdThings(){
		int i = 0;
		for (System.out.println("ain't gonna declare or initialize."); i++ < 3; System.out.println("ain't increment either!"), System.out.println("resting..."), someFunction())
			;
	}
	
	private static void someFunction(){}
}


