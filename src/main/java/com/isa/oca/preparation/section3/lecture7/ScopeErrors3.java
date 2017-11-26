package com.isa.oca.preparation.section3.lecture7;

public class ScopeErrors3 {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            boolean valid = false;
            if (i == 0) {
                valid = true;
                break;
            }
        }
//		 System.out.println(i); // i is no longer alive
//		 System.out.print(valid); // valid is no longer accessible

        {
            int x = 12;
        }
//		 System.out.println(x); // x is no more
    }
}
