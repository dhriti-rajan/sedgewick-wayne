package com.github.dhriti.sedgewick_wayne.ch1.s3;

import java.util.Random;

public class P42_GameSimulation {
    public static void main(String[] args) {
        double n = Integer.parseInt(args[0]);

        // First Strategy: No Switching
        // Second Strategy: Switching

        double stayWins = 0;
        double switchWins = 0;
        Random generator = new Random();
        for (int plays = 0; plays < n; ++plays) {
            int[] doors = {0, 0, 0}; // 0 is a goat, 1 is a car
            doors[generator.nextInt(3)] = 1;
            int choice = generator.nextInt(3);
            int shown;
            do {
                shown = generator.nextInt(3);
            } while (doors[shown] == 1 || shown == choice);
            stayWins += doors[choice];
            switchWins += doors[3 - choice - shown];
        }
        System.out.println("Probability that Staying Wins: " + stayWins/n);
        System.out.println("Probability that Switching Wins: " + switchWins/n);
    }
}
