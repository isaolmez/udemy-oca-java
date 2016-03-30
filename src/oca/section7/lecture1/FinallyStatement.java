package oca.section7.lecture1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import oca.common.Animal;

public class FinallyStatement {
	public static void main(String[] args) {
		/**
		 * 1st example
		 */
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("/input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close(); // Close the scanner instance.
		}
		
		/**
		 * 2nd example
		 */
		FileReader reader = null;
		try {
			reader = new FileReader("/input.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {  // close() can throw exception. Enclose in try/catch.
				reader.close(); // Close the file reader.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * Advanced example
		 */
		Animal a = go();
		System.out.println(a.getHeight());
	}
	
	private static Animal go(){
		Animal a = null;
		try{
			a = new Animal();
			a.setHeight("100");
			return a;
		}
		finally{
			a = new Animal();
			a.setHeight("20");
		}
		
	}
}
