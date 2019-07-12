package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P37_BridgeHands {
    public static void main(String[] args) {
        int count5332 = 0;
        int count4432 = 0;
        int count4333 = 0;

        int[] a5332 = {5, 3, 3, 2};
        int[] a4432 = {4, 4, 3, 2};
        int[] a4333 = {4, 3, 3, 3};

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; ++i) {
            int[] suitDistribution = new int[4];
            for (int j = 0; j < 13; ++j) {
                double suit = Math.random();
                if (suit < 0.25) ++suitDistribution[0];
                else if (suit < 0.5) ++suitDistribution[1];
                else if (suit < 0.75) ++suitDistribution[2];
                else ++suitDistribution[3];
            }

            if (suitDistribution.equals(a5332)) ++count5332;
            else if (suitDistribution.equals(a4432)) ++count4432;
            else if (suitDistribution.equals(a4333)) ++count4333;
        }

        int mostLikely = Math.max(count4333, Math.max(count4432, count5332));
        if (mostLikely == count4333) System.out.println("4-3-3-3 is most likely");
        else if (mostLikely == count4432) System.out.println("4-4-3-2 is most likely");
        else System.out.println("5-3-3-2 is most likely");
    }
}
