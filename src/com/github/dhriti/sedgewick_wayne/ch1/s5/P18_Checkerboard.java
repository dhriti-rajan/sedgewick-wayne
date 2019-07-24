package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class P18_Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        drawCheckerboard(n);
    }

    private static void drawCheckerboard(int n) {
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if ((i + j) % 2 == 0) StdDraw.setPenColor(Color.red);
                else StdDraw.setPenColor(Color.black);

                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
