package oca.section5.lecture4;

public class ForLoopConditional {
	public static void main(String[] args) {
		for (int a = 0, b = 10, c = 10; (((a + b > 10) || (b-- > 2)) & c-- == 3); a++) {
		}

		/**
		 * Cannot have multiple test expressions.
		 */
//		 for(int i = 0, j = 5; i < 10, j++ > 3; i++){}
	}
}
