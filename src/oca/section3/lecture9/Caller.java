package oca.section3.lecture9;

import java.awt.Color;

public class Caller {
	void test() {
		Callee callee = new Callee();
		Color myC = Color.RED;
		int myI = 3;
		short myS = 9;
		callee.go(myC, myI, myS);
	}
}

class Callee {
	void go(Color c, int i, short s) {
		c = Color.BLACK;
		i = 12;
		s = 24;
	}
}
