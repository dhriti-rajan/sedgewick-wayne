package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P5_LongestRun {
    public static void main(String[] args) {
        int[] numbers = StdIn.readAllInts();
        longestRun(numbers);
    }


    private static void longestRun(int[] given) {
        int start = 1;
        int end = 2;
        int longestRun = 0;
        int longstart = 1;
        int longend = 2;
        while (end < given.length) {
            while (given[start] == given[end]) ++end;
            if (end - start > longestRun) {
                longestRun = end - start;
                longstart = start;
                longend = end - 1;
            }
            start = end;
            end += 1;
        }

        System.out.println("Longest Run: " + (longend - longstart + 1) + " consecutive " + given[longstart] + "'s");
    }
}
