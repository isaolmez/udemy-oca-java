package instanceofs;

public class InstanceOfs {
	public static void main(String [] args) {
	    Dog d = new Dog(); 
	    //Farklı hiyerarşi ağaçlarına dahil classlar instanceoflar direk kontorl edilemez, compile hatası alır
	    //System.out.println(d instanceof Cat); 
	    
	    //Fakat bu şekilde olur. Object üzerinden/aynı class hiyerarşisinden test edilebilir.
	    compare(d);
	    
	    //instanceof null ile kullanılabilir ve her zaman false döner
	    System.out.println( null instanceof Cat);
	  }
	  static void compare(Object o){
		  System.out.println(o instanceof Cat); 
	  }
}

class Cat { } 
class Dog { }
