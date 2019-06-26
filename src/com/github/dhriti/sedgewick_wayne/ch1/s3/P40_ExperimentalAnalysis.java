package com.github.dhriti.sedgewick_wayne.ch1.s3;

// Comparing runtime of taylor series expansion to find the value of e to the
// power of a given x to the method using Math.pow().

import java.util.function.Function;

public class P40_ExperimentalAnalysis {
    private static float benchmark(
            Function<Double, Double> function, double argument, int iterations) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterations; ++i)
            function.apply(argument);
        long elapsed = System.currentTimeMillis() - start;
        return elapsed / 1000.0F;
    }

    public static void main(String[] args) {
        System.out.println("Math.exp: " + benchmark(Math::exp, 64F, 10000000));
        System.out.println("P38_TaylorSeriesExpansion.getSum: " +
                benchmark(P38_TaylorSeriesExpansion::getSum, 64F, 10000000));
    }
}
