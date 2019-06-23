package com.github.dhriti.sedgewick_wayne.ch1.s2;

public class P30_UniformRandomNumbers {
    public static void main(String[] args) {
        double one = Math.random();
        double two = Math.random();
        double three = Math.random();
        double four = Math.random();
        double five = Math.random();

        System.out.println("First: " + one);
        System.out.println("Second: " + two);
        System.out.println("Third: " + three);
        System.out.println("Fourth: " + four);
        System.out.println("Fifth: " + five);
        System.out.println("Average: " + ((one + two + three + four + five)/5));

        double minimum = Math.min(one, Math.min(two, Math.min(three, Math.min(4, 5))));

        System.out.println("Minimum: " + minimum);

        double maximum = Math.max(one, Math.max(two, Math.max(three, Math.max(4, 5))));

        System.out.println("Maximum: " + maximum);
    }
}
