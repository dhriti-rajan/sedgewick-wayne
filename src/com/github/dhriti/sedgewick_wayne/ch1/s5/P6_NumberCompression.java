package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P6_NumberCompression {
    public static void main(String[] args) {
        int[] numbers = StdIn.readAllInts();
        int previous = numbers[0];
        System.out.println(previous);
        for (int i = 1; i < numbers.length; ++i) {
            if (numbers[i] == previous) continue;
            else {
                previous = numbers[i];
                System.out.println(previous);
            }
        }
    }
}
