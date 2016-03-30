package oca.section2.lecture9;

public class ReturnTypesInOverridingTest {
}

class Hi {
	Object talk(String s) {
		return null;
	}
}

class Hello extends Hi {
	String talk(String s) {
		return "";
	}
}
