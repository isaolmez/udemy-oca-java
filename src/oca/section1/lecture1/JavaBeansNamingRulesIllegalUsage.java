package oca.section1.lecture1;

import java.awt.event.ActionListener;

public class JavaBeansNamingRulesIllegalUsage {
	/**
	 * Examples of invalid JavaBean method signatures are
	 */
	
	// must be public
	void setCityName(String name){};    		

	// can't use increment
	public void incrementCounter(int value){};
	
	// listener type mismatch
	public void addMyListener(ActionListener m){} 

}
