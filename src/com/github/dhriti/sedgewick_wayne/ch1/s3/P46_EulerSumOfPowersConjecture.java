package com.github.dhriti.sedgewick_wayne.ch1.s3;

import java.util.Arrays;

public class P46_EulerSumOfPowersConjecture {
    public static void main(String[] args) {
        boolean found = false;
        long[] fifth = new long[250];

        for (int i = 1; i <= 250; ++i) {
            long i2 = i * i;
            fifth[i - 1] = i2 * i2 * i;
        }

        for (int a = 0; a < 250 && !found; ++a) {
            for (int b = a; b < 250 && !found; ++b) {
                for (int c = b; c < 250 && !found; ++c) {
                    for (int d = c; d < 250 && !found; ++d) {
                        long sum = fifth[a] + fifth[b] + fifth[c] + fifth[d];
                        int e = Arrays.binarySearch(fifth, sum);
                        found = (e >= 0);
                        if (found) {
                            // the value at e is a perfect to the fifth power
                            System.out.println((a + 1) + "^5 + "
                            + (b + 1) + "^5 + " + (c + 1) + "^5 + "
                            + (d + 1) + "^5 = " + (e + 1) + "^5");
                        }
                    }
                }
            }
        }
    }
}
