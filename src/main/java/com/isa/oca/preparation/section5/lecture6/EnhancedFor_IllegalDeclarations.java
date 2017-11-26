package com.isa.oca.preparation.section5.lecture6;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class EnhancedFor_IllegalDeclarations {

    public static void main(String[] args) {
        /**
         * Arrays
         */
        int intVar;
        long longVar;
        long[] longArr = {4L, 5L, 6L};
        int[][] intRatings = {{4, 5, 4}, {8, 7, 8}, {9, 8, 9}};
        Letter[] letters = {new GreekLetter(), new LatinLetter()};

//		for(longVar : longArr) ; // Cannot resolve longVar 
//		for(int i : intRatings) ; // Can't convert from int array to int 
//		for(int i : longArr) ; // Can't convert from long to int
//		for(GreekLetter letter : letters) ; // Not all array elements are GreekLetter

        /**
         * Iterable collections
         */
        List<Integer> grades = new ArrayList<>();
//		for (Long integer : grades) ; // Cannot convert to Long 
//		for (int intVar: grades) ; // Duplicate variable intVar
    }
}
