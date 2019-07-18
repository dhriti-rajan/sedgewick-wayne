package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P2_MinAndMaxPositiveOnly {
    public static void main(String[] args) {
        int[] numbers = StdIn.readAllInts();

        if (allPositive(numbers)) {
            System.out.println("Minimum Value: " + findMin(numbers));
            System.out.println("Maximum Value: " + findMax(numbers));
        } else {
            System.out.println("Please enter only positive integers.");
        }
    }

    private static boolean allPositive(int[] numbers) {
        for (int i : numbers) {
            if (i <= 0) return false;
        }
        return true;
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
