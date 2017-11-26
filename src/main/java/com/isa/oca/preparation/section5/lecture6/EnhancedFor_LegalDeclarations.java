package com.isa.oca.preparation.section5.lecture6;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class EnhancedFor_LegalDeclarations {

    public static void main(String[] args) {
		/**
         * Arrays
         */
        Long[] LongArr = {1L, 2L, 3L};
        long[] longArr = {4L, 5L, 6L};
		for (long l : longArr) {
			; // Iterate through an array of longs
		}
		for (long lw : LongArr) {
			; // Long objects are unboxed into longs
		}

        int[][] intRatings = {{4, 5, 4}, {8, 7, 8}, {9, 8, 9}};
		for (int[] is : intRatings) {
			; // Iterate through the array of arrays
		}
		for (int r : intRatings[1]) {
			; // Iterate through the 2nd sub-array
		}

        String[] strSeasons = {"summer", "autumn", "winter", "spring"};
		for (String s : strSeasons) {
			; // Iterate through the array of Strings
		}

        Letter[] letters = {new GreekLetter(), new LatinLetter()};
		for (Letter l : letters) {
			; // Access with an Letter reference to each element
		}
		for (Object o : letters) {
			; // Access with an Object reference to each Letter
		}

        /**
         * Iterable collections
         */
        List<Integer> grades = new ArrayList<>();
		for (Integer integer : grades) {
			; // Iterate through List of Integers
		}
		for (int integer : grades) {
			; // Unbox into ints
		}
    }
}
