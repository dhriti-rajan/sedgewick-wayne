package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P39_CouponCollector {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double averageDrawings = 0;

        for (int i = 0; i < 1000; ++i) {
            int[] coupons = new int[n];

            while(notFinished(coupons)) {
                int coupon = (int) (Math.random() * n);
                ++coupons[coupon];
                ++averageDrawings;
            }
        }

        averageDrawings /= 1000;

        System.out.println(averageDrawings);
        System.out.println(nthHarmonicNumber(n) * n);
    }

    private static double nthHarmonicNumber(int n) {
        double num = 0;

        for (int i = 1; i <= n; ++i) {
            num += 1.0/i;
        }

        return num;
    }

    private static boolean notFinished(int[] coupons) {
        for (int i : coupons) {
            if (i == 0) return true;
        }
        return false;
    }
}
