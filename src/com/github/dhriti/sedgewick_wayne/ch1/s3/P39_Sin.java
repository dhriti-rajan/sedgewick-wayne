package com.github.dhriti.sedgewick_wayne.ch1.s3;

public class P39_Sin {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double term = x;
        double sum = term;
        for (int n = 2; sum != sum + term; n += 2) {
            term *= -1 * (Math.pow(x, 2))/(n * (n + 1));
            sum += term;
        }

        System.out.println(sum);
    }
}
