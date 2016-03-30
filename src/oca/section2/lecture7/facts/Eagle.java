package oca.section2.lecture7.facts;

import oca.section2.lecture7.Bird;

public class Eagle extends Bird implements Monogamous{
	public void hunt(){
		System.out.println("Hunting...");
	}

	public void beLoyal() {
		System.out.println("Forever and ever...");
	}
}
