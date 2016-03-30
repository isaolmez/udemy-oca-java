package oca.section1.lecture6;

public class VarArgTest {
}

class LegalExamples {
	// take from 0 to many ints as parameters
	void process(int... counts) {
	}

	// expects first a String,
	// then 0 to many ints
	void process2(String name, int... counts) {
	}

	// 0 to many Family Infos
	void process3(FamilyInfo... infos) {
	}

	// main method can be written as
	public static void main(String... args) {
	}
}

class IllegalExamples {
	// bad syntax
	// void process4(int ages...) { }

	// too many var-args, there can be only one
	// void process5(int... ages, String... names) { }

	// var-arg must be the last parameter
	// void process6(String... names, short s) { }
}