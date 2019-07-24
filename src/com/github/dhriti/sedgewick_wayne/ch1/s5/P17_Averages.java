package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P17_Averages {
    public static void main(String[] args) {
        double averageMagnitude = 0;
        double averagePower = 0;
        int zeroCrossings = 0;
        int counter = 0;
        double current = 0;
        double previous = 0;

        while (!StdIn.isEmpty()) {
            current = StdIn.readDouble();
            averageMagnitude += Math.abs(current);
            averagePower += Math.pow(current, 2);
            if (current < 0 && previous > 0 || previous < 0 && current > 0) {
                ++zeroCrossings;
            }
            ++counter;
            previous = counter;
        }

        averageMagnitude /= counter;
        averagePower /= counter;

        System.out.println("Average Magnitude: " + averageMagnitude);
        System.out.println("Average Power: " + averagePower);
        System.out.println("Zero Crossings: " + zeroCrossings);
    }
}
