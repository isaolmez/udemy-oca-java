package oca.section6.lecture1;

public class Strings2 {
	public static void main(String[] args) {
		String message = "Hello";

		message.concat(" World!"); // "Hello World!"
		System.out.println("message: " + message); // Prints Hello.

		message.toLowerCase(); // hello
		System.out.println("message: " + message); // Prints Hello.

		message.substring(3); // lo
		System.out.println("message: " + message); // Prints Hello.
		
		message = message.concat(" Java!"); // Hello Java!
		System.out.println("message: " + message); // Prints Hello Java!.
	}
}
