package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P29_HadamardMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        /*
        * T - 1
        *
        * T T - 2
        * T F
        *
        * T T T T - 4
        * T F T F
        * T T F F
        * T F F T
        * */

        /*
        * Methods used:
        * invertFourth - inverts fourth quadrant
        * assembleQuadrants - puts together four of the previous order matrices
        * generateQuadrant - generates the non - inverted quadrant;
        * */

        String[][] hadamardMatrix = assembleQuadrants(generateQuadrant(n));
        invertFourth(hadamardMatrix);

        System.out.println("This is the order " + n + " Hadamard Matrix: ");

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(hadamardMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] assembleQuadrants(String[][] quadrant) {
        String[][] quadrantsAssemble = new String[quadrant.length * 2][quadrant.length * 2];
        for (int i = 0; i < quadrant.length; ++i) {
            for (int j = 0; j < quadrant.length; ++j) {
                quadrantsAssemble[i][j] = quadrant[i][j];
            }
        }

        for (int i = quadrant.length; i < quadrant.length * 2; ++i) {
            for (int j = quadrant.length; j < quadrant.length * 2; ++j) {
                quadrantsAssemble[i][j] = quadrant[i - quadrant.length][j - quadrant.length];
            }
        }

        for (int i = 0; i < quadrant.length; ++i) {
            for (int j = quadrant.length; j < quadrant.length * 2; ++j) {
                quadrantsAssemble[i][j] = quadrant[i][j - quadrant.length];
            }
        }

        for (int i = quadrant.length; i < quadrant.length * 2; ++i) {
            for (int j = 0; j < quadrant.length; ++j) {
                quadrantsAssemble[i][j] = quadrant[i - quadrant.length][j];
            }
        }

        return quadrantsAssemble;
    }

    private static String[][] generateQuadrant(int n) {
        int size = n/2;
        int accumulatingsize = 1;
        String[][] currentQuadrant = {{"T"}};
        String[][] iteration;

        while (accumulatingsize != size) {
            iteration = assembleQuadrants(currentQuadrant);
            invertFourth(iteration);
            currentQuadrant = iteration;
            accumulatingsize *= 2;
        }
        return currentQuadrant;
    }

    private static void invertFourth(String[][] hadamardMatrix) {
        int start = hadamardMatrix.length/2;
        for (int i = start; i < hadamardMatrix.length; ++i) {
            for (int j = start; j < hadamardMatrix.length; ++j) {
                if (hadamardMatrix[i][j] == "T") hadamardMatrix[i][j] = "F";
                else hadamardMatrix[i][j] = "T";
            }
        }
    }
}