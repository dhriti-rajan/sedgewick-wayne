package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P33_FindingDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 4, 5};
        int n = numbers.length;
        boolean duplicates = false;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (numbers[i] == numbers[j]) duplicates = true;
            }
        }

        System.out.println(duplicates);
    }
}
