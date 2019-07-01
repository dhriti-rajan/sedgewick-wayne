package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P23_LongestPlateau {
    public static void main(String[] args) {
        int[] given = {1, 2, 2, 2, 2, 2, 1, 5, 5, 5, 5, 2};
        longestPlateau(given);
    }

    private static boolean isPlateau(int[] given, int start, int end) {
        if (given[start] <= given[start - 1]) return false;
        if (given[end] <= given[end + 1]) return false;
        for (int i = start + 1; i <= end; ++i) {
            if (given[i] != given[i - 1]) return false;
        }

        return true;
    }

    private static void longestPlateau(int[] given) {
        int start = 1;
        int end = 2;
        int longestplateau = 0;
        int longstart = 1;
        int longend = 2;
        while (end < given.length) {
            while (given[start] == given[end]) ++end;
            if (isPlateau(given, start, end - 1) && end - start > longestplateau) {
                longestplateau = end - start;
                longstart = start;
                longend = end - 1;
            }
            start = end;
            end += 1;
        }

        System.out.println("Longest plateau length: " + longestplateau);
        System.out.println("Longest plateau start: " + longstart);
        System.out.println("Longest plateau end: " + longend);
    }
}
