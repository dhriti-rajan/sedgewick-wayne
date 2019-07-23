package com.github.dhriti.sedgewick_wayne.ch1.s5;

public class P13_InterestTable {
    public static void main(String[] args) {
        double years = Double.parseDouble(args[0]);
        double principal = Double.parseDouble(args[1]);
        double interestRate = Double.parseDouble(args[2]);
        double f = principal * Math.pow(Math.E, interestRate * years);

        System.out.println(f);

        double monthlyPayment = f/12.0;
        double interest = f - principal;

        System.out.println("Monthly Payment:  Remaining Principal:  Interest Paid:");
        for (int i = 1; i < 13; ++i) {
            System.out.print(monthlyPayment + "  " + (principal * (12 - i)/12) +
                    "  " + (interest/12 * i));
            System.out.println();
        }
    }
}
