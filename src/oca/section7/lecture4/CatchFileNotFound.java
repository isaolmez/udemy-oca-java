package oca.section7.lecture4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatchFileNotFound {
	public static void main(String[] args) {
		try {
			new FileReader("test");
		} catch (Throwable t) {
		}

		try {
			new FileReader("test");
		} catch (Exception e) {
		}

		try {
			new FileReader("test");
		} catch (IOException e) {
		}

		try {
			new FileReader("test");
		} catch (FileNotFoundException e) {
		}

		try {
			new FileReader("test");
		} catch (FileNotFoundException e) {
		} catch (Exception e) {
		}
		
		try {
			new FileReader("test");
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} catch (Exception e) {
		} catch (Throwable t) {
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
