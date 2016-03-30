package oca.section1.lecture9;

public class EnumSemicolonTest {
	// Semicolon is optional
	enum ShirtColor { RED, GREEN, BLUE, BLACK; };
	enum ShirtColor2 { RED, GREEN, BLUE, BLACK; }
	
	
	// Semicolon at the end of constants is optional in this case
	enum ShirtColor3 { RED, GREEN, BLUE, BLACK; }
	enum ShirtColor4 { RED, GREEN, BLUE, BLACK }
	
	// Semicolon at the end of constants is needed if more code follows
	enum ShirtColor5 { 
		RED, GREEN, BLUE, BLACK; 
		// More code, in this case toString(), is following 
		public String toString() {
			return "color" + name();
		}
	}
	
}
