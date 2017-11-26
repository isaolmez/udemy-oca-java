package com.isa.oca.preparation.section5.lecture3;

public class DefaultCase {

    public static void main(String[] args) {
        int a = 5;
        switch (a) {
            case 1: {
                System.out.println("gold medal");
                break;
            }
            case 2:
                System.out.println("silver medal");
                break;
            case 3: {
                System.out.println("bronze medal");
                break;
            }
            default:  // no "case default:". just "default"
                System.out.println("Work harder!");
                break;
        }
        System.out.println("Medals have been given");

        int x = 5;
        switch (x) {
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("default");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
        }


    }
}
