package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P7_MissingValue {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] numbers = StdIn.readAllInts();
        int[] keepingTrack = new int[n];
        for (int i : numbers) ++keepingTrack[i - 1];
        for (int i = 0; i < n; ++i) {
            if (keepingTrack[i] == 0) System.out.println("The missing value is: " + (i + 1));
        }
    }
}
