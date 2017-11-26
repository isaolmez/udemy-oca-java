package com.isa.oca.preparation.section3.lecture14;

import com.isa.oca.preparation.common.Animal;

public class GarbageTest2 {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        System.out.println(a1);
        // Right now, the Animal object referred by a1 is not eligible
        a1 = a2;
        // Now, the Animal object referred by a1 is not eligible
    }
}
