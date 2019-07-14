package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P40_RiffleShuffle {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = 0;

        for (int i = 0; i < n; ++i) {
            double coin = Math.random();
            if (coin < 0.5) ++r;
        }

        int[] rdeck = new int[r];
        for (int i = 0; i < r; ++i) {
            rdeck[i] = i;
        }

        int rIndex = r - 1;

        int[] nrdeck = new int[n - r];
        for (int i = r; i < n; ++i) {
            nrdeck[i - r] = i;
        }

        int nrIndex = n - r - 1;

        int[] shuffledDeck = new int[n];
        int shuffledDeckIndex = 0;

        while ((rIndex >= 0 || nrIndex >= 0) && shuffledDeckIndex < n) {
            double firstPile = (rIndex + 1.0)/(rIndex + nrIndex + 2.0);
            double picking = Math.random();

            if (picking < firstPile) {
                shuffledDeck[shuffledDeckIndex] = rdeck[rIndex];
                ++shuffledDeckIndex;
                --rIndex;
            } else {
                shuffledDeck[shuffledDeckIndex] = nrdeck[nrIndex];
                ++shuffledDeckIndex;
                --nrIndex;
            }
        }

        for (int i : shuffledDeck) {
            System.out.print(i + " ");
        }
    }
}