package oca.section1.lecture3;
/**
 * 
 *  Interface methods must always be public and abstract
 *  
 *  But you do not have to explicitly declare them
 *  
 *  Even though you don't declare that way, they are implicitly public and abstract
 *
 */
public interface LegalInterfaceMethodModifiers {
	void fly1(); 			// implicitly public, abstract

	public void fly2(); 	// implicitly abstract

	abstract void fly3(); 	// implicitly public

	public abstract void fly4();

	abstract public void fly5();

}
