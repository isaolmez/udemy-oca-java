package com.isa.oca.preparation.section1.lecture7;

import com.isa.oca.preparation.common.Animal;

public class ArrayDeclarationTest {

    /**
     * One dimensional arrays
     */
    int[] numbers;
    int numbers2[];
    int[] numbers3;
    int numbers4[];

    Animal[] animals;
    Animal animals2[];
    Animal[] animals3;
    Animal animals4[];


    /**
     * Multi-dimensional arrays
     */

    String[][][] students;
    String[][] students2[];
    String[] students3[][];
    String students4[][][];

    String[][] developers;
    String[] developers2[];
    String developers3[][];
}

class IllegalArrayDeclarations {
    // Size cannot be specified in declaration
    // String[2] names;
}
