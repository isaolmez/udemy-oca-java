package com.isa.oca.preparation.section3.lecture10;

public class InitializationShortcut1 {

    public static void main(String[] args) {
        /**
         * One-dimensional arrays
         */
        int[] orders = {6, 7, 8};
        int[] orders2;
        orders = new int[3];
        orders[0] = 6;
        orders[1] = 7;
        orders[2] = 8;

        short[] votes = {100, 211, 120};
        short[] votes2;
        votes2 = new short[3];
        votes2[0] = 100;
        votes2[1] = 211;
        votes2[2] = 120;

        String[] names = {"John", "Amy", "Jack"};
        String[] names2;
        names2 = new String[3];
        names2[0] = "John";
        names2[1] = "Amy";
        names2[2] = "Jack";

        Game cs = new Game("Counter Strike");
        Game[] games = {cs, new Game("AoE"), new Game("WoW"), null};
        cs.setName("CS");
        System.out.println(games[0].getName());

        /**
         * Multi-dimensional arrays
         */
        int[][] movieRatings = {{8, 9, 8, 9, 10}, {2, 3, 1}, {1, 3}};

    }
}
