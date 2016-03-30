package oca.section3.lecture1;
 class Cage{ }
 class Bird {
   Cage c;         			// instance variable
   String name;      			// instance variable
   public static void main(String [] args) {
     Bird b;                         		// local variable: b
     b = new Bird();
     b.nest(b);
   }
   void nest(Bird bird) {               	// local variable: bird
     c = new Cage();              
     bird.setName("Twitty");
   }
   void setName(String birdName) {   	// local var: birdName
     name = birdName;  
   }
 }

