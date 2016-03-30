package oca.section2.lecture14;

import static java.lang.Math.PI;
import static java.lang.Math.*;

public class StaticImportTest {

	void methodWithRegularAccess() {
		double r = Math.cos(Math.PI * 2);
	}

	void methodUsingStaticImport() {
		double r = cos(PI * 2);
	}
}
