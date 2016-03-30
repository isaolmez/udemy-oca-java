/**
 * Overloaded Methods
 * 
 * Overloaded methods must change the argument list
 */
package oca.section2.lecture5;
public class Applicant {

	public void apply(int identityNumber){
		System.out.println("int" );
	}
	
//	public void apply(int licenseNumber){}
	
	public void apply(String name, int identityNumber){
		System.out.println("String, int" );
	}
	
	public void apply(int identityNumber, String name){
		System.out.println("int, String" );
	}
	
	public void apply(String name, String surname){
		System.out.println("String, String" );
	}
	
//	public String apply(String name, String surname){}
}
