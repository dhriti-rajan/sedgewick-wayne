package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P22_DiceSimulationExperimental {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] frequencies = new int[13];

        for (int i = 0; i < n; ++i) {
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            frequencies[die1 + die2]++;
        }

        double[] probabilities = new double[13];
        for (int k = 1; k <= 12; ++k) {
            probabilities[k] = (float) frequencies[k] / n;
        }

        for (int h = 1; h < 13; ++h) {
            System.out.println(probabilities[h]);
        }
    }
}
