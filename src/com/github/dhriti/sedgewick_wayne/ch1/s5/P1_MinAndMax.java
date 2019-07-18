package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P1_MinAndMax {
    public static void main(String[] args) {
        int[] numbers = StdIn.readAllInts();
        System.out.println("Minimum Value: " + findMin(numbers));
        System.out.println("Maximum Value: " + findMax(numbers));
    }

    private static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i : numbers) {
            if (i < min) min = i;
        }
        return min;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i : numbers) {
            if (i > max) max = i;
        }
        return max;
    }
}
