package oca.section3.lecture10;

public class MultiDimConstruction {
	public static void main(String[] args) {
		int[][] vals = new int[2][];
		System.out.println("Printing...");
		for (int i = 0; i < vals.length; i++) {
			for (int j = 0; j < vals[i].length; j++) {
				System.out.println(vals[i][j]);
			}
		}
	}
}
