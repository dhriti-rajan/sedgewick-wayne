package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P22_DiceSimulationTheoretical {
    public static void main(String[] args) {
        int[] frequencies = new int[13];
        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= 6; ++j) {
                frequencies[i + j]++;
            }
        }

        double[] probabilities = new double[13];
        for (int k = 1; k <= 12; ++k) {
            probabilities[k] = frequencies[k] / 36.0;
        }

        for (int h = 1; h < 13; ++h) {
            System.out.println(probabilities[h]);
        }
    }
}
