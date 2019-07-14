package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P41_BinomialDistribution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double[][] distribution = new double[n + 1][];

        for (int i = 0; i <= n; ++i) {
            distribution[i] = new double[i + 2];
            distribution[i][0] = 0.0;
            distribution[i][i] = 0.0;
        }

        distribution[1][1] = 1.0;

        // 0 0
        // 0 1 0
        // 0 1/2 1/2 0
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                distribution[i][j] = (distribution[i - 1][j] + distribution[i - 1][j - 1])/2.0;
            }
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(distribution[i][j] + " ");
            }
            System.out.println();
        }
    }
}
