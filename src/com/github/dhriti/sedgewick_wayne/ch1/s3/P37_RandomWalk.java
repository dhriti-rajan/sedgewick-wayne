package com.github.dhriti.sedgewick_wayne.ch1.s3;

public class P37_RandomWalk {
    public static void main(String[] args) {
        int[] coordinates = {0, 0};
        int n = Integer.parseInt(args[0]);
        int totalSteps = 0;

        for (int i = 0; i < 100; ++i) {
            int tempSteps = walk(coordinates, n);
            totalSteps += tempSteps;
            coordinates[0] = 0;
            coordinates[1] = 0;
        }
        totalSteps /= 100;

        System.out.println("The average number of steps needed to walk a "
         + 2 * n + " by " + 2 * n + " square is: " + totalSteps);
    }

    private static int walk(int[] coordinates, int n) {
        int steps = 0;

        while (coordinates[0] < n && coordinates[0] > -n &&
            coordinates[1] < n && coordinates[1] > -n) {
            int direction = (int) (Math.random() * 4);
            if (direction == 0) coordinates[0] += 1;
            else if (direction == 1) coordinates[0] -= 1;
            else if (direction == 2) coordinates[1] += 1;
            else coordinates[1] -= 1;
            ++steps;
        }
        return steps;
    }
}
