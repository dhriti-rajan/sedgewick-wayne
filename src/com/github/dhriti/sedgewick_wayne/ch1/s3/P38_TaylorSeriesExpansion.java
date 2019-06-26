package com.github.dhriti.sedgewick_wayne.ch1.s3;

public class P38_TaylorSeriesExpansion {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double sum = getSum(x);
        System.out.println(sum);
    }

    static double getSum(double x) {
        double term = 1.0;
        double sum = term;
        for (int n = 1; sum != sum + term; ++n) {
            term *= x/n;
            sum += term;
        }
        return sum;
    }
}
