package com.github.dhriti.sedgewick_wayne.ch1.s3;

public class P41_PepysProblemTheoretical {
    public static void main(String[] args) {
        // Probability of at least one 1 when rolling 6 times:
        double one = 1.0 - Math.pow(5.0/6, 6);

        // Probability of at least two 1's when rolling 12 times:
        double two = 1.0 - Math.pow(5.0/6, 12) - (1.0/6*(Math.pow(5.0/6, 11))*12);
        System.out.println("1st case: " + one);
        System.out.println("2nd case: " + two);
    }
}