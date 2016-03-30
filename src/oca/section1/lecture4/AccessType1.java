package oca.section1.lecture4;

public class AccessType1 {
}

class Devops {
	public String deploy() {
		return "Starting to deploy!";
	}
}

class Manager {
	public void deployTheApp() {
		// If this line compiles, Manager has access to the Devops class
		Devops d = new Devops();

		// But... does it have access to the deployMethod()?
		System.out.println("A Devops says, " + d.deploy());
		// The preceding line works because Manager can access the
		// public method
	}
}
