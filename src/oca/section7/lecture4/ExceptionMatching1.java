package oca.section7.lecture4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMatching1 {
	public static void main(String[] args) {
		try {
			// Code here
		} catch (Exception e) { // Catch 'em all
			// Catches Exception class and all its subtypes.
			// This means all exceptions except Error and its subtypes.
		}

		try {
			// Code here
		} catch (NullPointerException e) {
			// Catches only NullPointerException
		}

		
		/**
		 * Super classes match itself and all its subtypes
		 */
		FileReader reader = null;
		try {
			reader = new FileReader("test");
			reader.read();
		} catch (FileNotFoundException e) {
			// Handle FileNotFoundException specifically
			System.out.println("File is not found!");
		} catch (IOException ex) {
			// Handle ALL other IOException in the same way
			System.out.println("IO exception occured!");
		}

		
		/**
		 * Order of catch clauses
		 */
		// If classes are in the same class hierarchy.
		FileReader reader2 = null;
		try {
			reader2 = new FileReader("test");
			reader2.read();
		} 
		catch (IOException e) { // Compiler error.
		} 
//		catch (FileNotFoundException e) {
//		}

		
		// If one class is not subclass/superclass of the other.
		try {
			new FileReader("test");
		} catch (NullPointerException e) {
		} catch (FileNotFoundException e) {
		}
		
		try {
			new FileReader("test");
		} catch (FileNotFoundException e) {
		} catch (NullPointerException e) {
		}

		
	}
}
