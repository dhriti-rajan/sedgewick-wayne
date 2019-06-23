package com.github.dhriti.sedgewick_wayne.ch1.s2;

public class P27_GaussianRandomNumbers {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();
        double r = Math.sin(2 * v * Math.PI) * Math.pow(-2 * Math.log(u), 1/2);
        System.out.println(r);
    }
}
