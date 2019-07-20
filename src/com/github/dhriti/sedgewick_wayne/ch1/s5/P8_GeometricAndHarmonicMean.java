package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P8_GeometricAndHarmonicMean {
    public static void main(String[] args) {
        double[] numbers = StdIn.readAllDoubles();

        // First calculating the geometric mean
        double product = 1;
        for (double i : numbers) {
            product *= i;
        }

        double geometricMean = Math.pow(product, 1.0/numbers.length);

        // Calculating the harmonic mean
        double sum = 0;
        for (double i : numbers) {
            sum += 1.0/i;
        }

        double harmonicMean = numbers.length/sum;

        System.out.println("Geometric Mean: " + geometricMean);
        System.out.println("Harmonic Mean: " + harmonicMean);
    }
}