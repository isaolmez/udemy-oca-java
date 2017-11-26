package com.isa.oca.preparation.section5.lecture6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnhancedForLoop {

    public static void main(String[] args) {
		/**
         * Arrays can be traversed.
         */
        int[] numbers = {1, 2, 3};
		for (int i = 0; i < numbers.length; i++)            // basic for loop
		{
			System.out.print(numbers[i]);
		}

		for (int i : numbers)            // enhanced for loop
		{
			System.out.print(i);
		}

        /**
         * Collection interface extends Iterable interface.
         * Most of the Java collections except maps implement Collection interface.
         */
        System.out.println("\n******");
        Set<String> set = new HashSet<>();
        set.add("set1");
        set.add("set2");
        for (String elem : set) {
            System.out.println(elem);
        }

        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
