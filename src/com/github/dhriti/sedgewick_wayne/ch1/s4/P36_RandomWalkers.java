package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P36_RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] grid = new boolean[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                grid[i][j] = false;
            }
        }

        int averageRandomWalkLength = 0;

        for (int i = 0; i < n; ++i) {
            int x = n/2;
            int y = n/2;

            while(!allWalked(grid)) {
                double direction = Math.random();

                if (direction < 0.25) {
                    if (x + 1 >= 0 && x + 1 < n) {
                        ++x;
                        ++averageRandomWalkLength;
                        grid[x][y] = true;
                    }
                } else if (direction < 0.5) {
                    if (x - 1 >= 0 && x - 1 < n) {
                        --x;
                        ++averageRandomWalkLength;
                        grid[x][y] = true;
                    }
                } else if (direction < 0.75) {
                    if (y + 1 >= 0 && y + 1 < n) {
                        ++y;
                        ++averageRandomWalkLength;
                        grid[x][y] = true;
                    }
                } else if (direction < 1.00) {
                    if (y - 1 >= 0 && y - 1 < n) {
                        --y;
                        ++averageRandomWalkLength;
                        grid[x][y] = true;
                    }
                }
            }
        }

        averageRandomWalkLength /= n;
        System.out.println(averageRandomWalkLength);
    }

    private static boolean allWalked(boolean[][] grid) {
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (!grid[i][j]) return false;
            }
        }
        return true;
    }
}
