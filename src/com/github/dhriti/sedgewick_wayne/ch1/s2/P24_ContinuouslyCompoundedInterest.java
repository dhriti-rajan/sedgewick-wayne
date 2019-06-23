package com.github.dhriti.sedgewick_wayne.ch1.s2;

public class P24_ContinuouslyCompoundedInterest {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double f = p * Math.pow(Math.E, r*t);
        System.out.println("Total Amount: $" + f);
    }
}
