package oca.section5.lecture1;

public class ElseIfStatement {
	public static void main(String[] args) {
		int inventoryCount = 10;
		if (inventoryCount < 100) {
			// Order new items
		} else {
			if (inventoryCount < 2000) {
				// Continue daily routine
			} else {
				// Advertise the product
			}
		}

		/**
		 * Else-if Statement 
		 */
		if (inventoryCount < 100) {
			// Order new items
		} else if (inventoryCount < 2000) {
			// Continue daily routine
		} else {
			// Advertise the product
		}

		/**
		 * Else clause belongs to innermost if statement
		 */
		int itemType = 2;
		if (itemType < 10)
		if (itemType == 1)
			System.out.println("inner if");
		else
			System.out.println("belongs to whom?");
		
		/**
		 *  Misleading indentation
		 */
		if (itemType < 10)
		    if (itemType == 1)
		      System.out.println("inner if");
		else
		  System.out.println("belongs to whom?");

	}
}
