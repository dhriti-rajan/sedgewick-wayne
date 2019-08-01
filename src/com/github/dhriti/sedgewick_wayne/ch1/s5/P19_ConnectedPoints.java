package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdDraw;

public class P19_ConnectedPoints {
    public static void main(String[] args) {
        // Number of points drawn
        int n = Integer.parseInt(args[0]);

        // Probability that each line is drawn
        double p = Double.parseDouble(args[1]);

        drawPoints(n);
        drawLines(n, p);
    }

    private static void drawPoints(int n) {
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);

        double angle = 2.0 * Math.PI / n;

        for (int i = 0; i < n; ++i) {
            double currentAngle = angle * i;
            drawPoint(Math.cos(currentAngle), Math.sin(currentAngle));
        }
    }


    private static void drawPoint(double x, double y) {
        StdDraw.filledCircle(x, y, 0.01);
    }


    private static void drawLines(int n, double p) {
        double angle = 2.0 * Math.PI / n;
        for (double i = 0; i < 2 * Math.PI; i += angle) {
            for (double j = i + angle; j < 2 * Math.PI; j += angle) {
                double drawline = Math.random();
                if (drawline < p) {
                    StdDraw.line(Math.cos(i), Math.sin(i), Math.cos(j), Math.sin(j));
                }
            }
        }
    }
}
