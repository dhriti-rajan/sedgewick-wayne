package com.github.dhriti.sedgewick_wayne.ch1.s3;

public class P44_ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        } if (a > c) {
            int t = a;
            a = c;
            c = t;
        } if (b > c) {
            int t = b;
            b = c;
            c = t;
        }

        // This code sorts a, b, and c in ascending order because it swaps the
        // pairs as needed in order to ensure that within each pair, the first
        // variable alphabetically is the smallest number.
    }
}
