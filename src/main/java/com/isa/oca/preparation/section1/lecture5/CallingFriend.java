/**
 * hi5() method of Friend class has protected access. Since CallingFriend is in the same package, it
 * can call hi5() method
 */
package com.isa.oca.preparation.section1.lecture5;

public class CallingFriend {

    protected void callFriend() {
        Friend f = new Friend();
        f.hi5();
    }
}
