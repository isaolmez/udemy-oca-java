package com.isa.oca.preparation.section1.lecture5;

import com.isa.oca.preparation.section1.lecture5.out.SeparatedBestFriend;

public class PackageClass {

    public static void main(String[] args) {
        SeparatedBestFriend bestFriend = new SeparatedBestFriend();
        bestFriend.hi5(); // Can access. hi5() method belongs to this package.
    }
}
