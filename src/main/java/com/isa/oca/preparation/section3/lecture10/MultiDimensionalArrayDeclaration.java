package com.isa.oca.preparation.section3.lecture10;

import com.isa.oca.preparation.common.Animal;

@SuppressWarnings("unused")
public class MultiDimensionalArrayDeclaration {

    public static void main(String[] args) {
        String[][][] localStores; // Recommended.
        String[][] localStores2[];
        String[] localStores3[][];
        String localStores4[][][];

        String[] localPools[];
        int[][] monthlyScores;
        Animal[][] animals;
    }
}
