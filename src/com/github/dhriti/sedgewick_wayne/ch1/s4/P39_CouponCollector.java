package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P39_CouponCollector {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        
    }

    private static double nthHarmonicNumber(int n) {
        double num = 0;

        for (int i = 1; i <= n; ++i) {
            num += 1.0/i;
        }

        return num;
    }
}
