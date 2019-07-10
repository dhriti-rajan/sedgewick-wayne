package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P35_3DSelfAvoidingWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        for(int t = 0; t < trials; t++) {
            boolean[][][] a = new boolean[n][n][n];
            int x = n/2, y = n/2, z = n/2;
            while (x > 0 && x < n - 1 && y > 0 && y < n - 1 && z > 0 && z < n - 1) {
                // Check for dead end and make a random move.
                a[x][y][z] = true;
                if (a[x - 1][y][z] && a[x + 1][y][z] && a[x][y - 1][z] &&
                    a[x][y + 1][z] && a[x][y][z - 1] && a[x][y][z + 1]) {
                    deadEnds++;
                    break;
                }
                double r = Math.random();
                if (r < 1.0/6) {
                    if (!a[x + 1][y][z]) x++;
                } else if (r < 1.0/3) {
                    if (!a[x - 1][y][z]) x--;
                } else if (r < 0.5) {
                    if (!a[x][y + 1][z]) y++;
                } else if (r < 2.0/3) {
                    if (!a[x][y - 1][z]) y--;
                } else if (r < 5.0/6) {
                    if (!a[x][y][z + 1]) z++;
                } else if (r < 1.00) {
                    if (!a[x][y][z - 1]) z--;
                }
            }
        }

        System.out.println(100 * deadEnds/trials + "% dead ends");
    }
}
