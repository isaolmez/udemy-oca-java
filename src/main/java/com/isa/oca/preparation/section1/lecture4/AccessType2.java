package com.isa.oca.preparation.section1.lecture4;

public class AccessType2 {

}

class Devops2 {

    public String deploy() {
        return "Starting to deploy!";
    }
}

class Manager2 extends Devops2 {

    public void deployTogether() {
        // Manager can inherit public deployMethod() from Devops
        this.deploy();

        // It can also access Devops class
        Devops2 d = new Devops2();
        // and call deployMethod()
        System.out.println("Working together " + d.deploy());
    }
}
