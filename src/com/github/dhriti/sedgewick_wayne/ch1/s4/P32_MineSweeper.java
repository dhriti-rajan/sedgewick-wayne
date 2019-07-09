package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P32_MineSweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        boolean[][] mines = new boolean[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                double bomb = Math.random();
                if (bomb < p) mines[i][j] = true;
                else mines[i][j] = false;
            }
        }

        printBombs(mines);

        System.out.println();

        printBombsCounted(bombsCounted(mines));
    }

    private static void printBombs(boolean[][] mines) {
        int rows = mines.length;
        int columns = (mines[0]).length;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (mines[i][j]) System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }

    private static void printBombsCounted(int[][] bombsCounted) {
        int rows = bombsCounted.length;
        int columns = bombsCounted[0].length;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (bombsCounted[i][j] == -1) System.out.print("* ");
                else System.out.print(bombsCounted[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] bombsCounted(boolean[][] mines) {
        int rows = mines.length;
        int columns = mines[0].length;
        int[][] counting = new int[rows][columns];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < rows; ++j) {
                if (mines[i][j]) counting[i][j] = -1;
                else counting[i][j] = 0;
            }
        }

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (counting[i][j] == -1) continue;
                for (int a = Math.max(i - 1, 0); a <= i + 1 && a >= 0 && a < rows; ++a) {
                    for (int b = Math.max(j - 1, 0); b <= j + 1 && b >= 0 && b < columns; ++b) {
                        if (counting[a][b] == -1) ++counting[i][j];
                    }
                }
            }
        }

        return counting;
    }
}
