package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P4_MeanandSampleStandardDeviationFilter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] numbers = StdIn.readAllInts();
        double mean = 0;
        double stdDeviation = 0;

        for (int i : numbers) mean += i;
        mean /= n;

        for (int i : numbers) stdDeviation += Math.pow(Math.abs(i - mean), 2);
        stdDeviation = Math.sqrt(stdDeviation);
        stdDeviation /= n - 1;

        double border = stdDeviation * 1.5;

        for (int i : numbers) {
            if (Math.abs(mean - i) > border) System.out.println(i);
        }
    }
}
