package com.github.dhriti.sedgewick_wayne.ch1.s5;

public class P10_RandomIntSeq {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int count = 0;
        for (int i = 0; i < n; ++i) {
            int number = (int) (Math.random() * m);
            if (count < 10) {
                System.out.print(number + " ");
                ++count;
            } else {
                count = 0;
                System.out.println();
                --i;
            }
        }
    }
}
