package oca.section2.lecture13.out;

import oca.section2.lecture13.Machine;

public class Computer extends Machine{
	void test(){
		System.out.println(++id);	// Can access. Inherits
		printMotto();  // Can access. Inherits
	}
}
