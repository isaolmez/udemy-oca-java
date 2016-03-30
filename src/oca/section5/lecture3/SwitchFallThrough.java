package oca.section5.lecture3;

public class SwitchFallThrough {
	public static void main(String[] args) {
		String sport = "basketball";
		switch (sport) {
		case "football":
			System.out.println("Football.");
		case "basketball":
			System.out.println("Basketball.");
		case "Tennis":
			System.out.println("Tennis.");
			break;
		default:
			System.out.println("Unknown");
		}
		
		
		int a = 1; 
		switch(a) { 
		case 1: System.out.println("gold medal"); // Entry point
		case 2: System.out.println("silver medal"); 
		case 3: System.out.println("bronze medal");
		} 
		System.out.println("Medals have been given");
		
		
		a = 1; 
		switch(a) { 
		case 1: { System.out.println("gold medal");  break; }  
		case 2: System.out.println("silver medal"); break;  
		case 3: {
			System.out.println("bronze medal");
			break;
		}
		}
		System.out.println("Medals have been given");

	}
}
