package com.isa.oca.preparation.section2.lecture13;

public class StaticMethodTest {

    public static void main(String[] args) {
        System.out.println(AccountingUtils.calculateRevenue(2200.3));
        System.out.println(AccountingUtils.calculateTaxes(2050.2));
    }
}

class AccountingUtils {

    public static double calculateRevenue(double income) {
        return (income * 0.1) + 100;
    }

    public static double calculateTaxes(double amount) {
        return amount * 0.25;
    }
}

