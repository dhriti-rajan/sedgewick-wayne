package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class P20_SuitSymbols {
    public static void main(String[] args) {
        drawSpade();
    }

    private static void drawHeart() {
        double[] x = {0.25, 0.5, 0.75, 0.5};
        double[] y = {0.35, 0.1, 0.35, 0.6};

        StdDraw.setPenColor(Color.red);
        StdDraw.filledPolygon(x, y);

        StdDraw.filledCircle(0.625, 0.475, 0.177);
        StdDraw.filledCircle(0.375, 0.475, 0.177);
    }

    private static void drawDiamond() {
        double[] x = {0.25, 0.5, 0.75, 0.5};
        double[] y = {0.5, 0.1, 0.5, 0.9};

        StdDraw.setPenColor(Color.red);
        StdDraw.filledPolygon(x, y);
    }

    private static void drawClub() {
        StdDraw.setPenColor(Color.black);
        double[] x = {0.45, 0.5, 0.55};
        double[] y = {0.25, 0.5, 0.25};

        StdDraw.filledPolygon(x, y);
        StdDraw.filledCircle(0.5, 0.6, 0.1);
        StdDraw.filledCircle(0.4, 0.45, 0.1);
        StdDraw.filledCircle(0.6, 0.45, 0.1);
        StdDraw.filledCircle(0.5, 0.45, 0.07);
    }

    private static void drawSpade() {
        StdDraw.setPenColor(Color.black);
        double[] x1 = {0.29, 0.5, 0.71, 0.5};
        double[] y1 = {0.5, 0.3, 0.5, 0.8};

        StdDraw.filledPolygon(x1, y1);
        StdDraw.filledCircle(0.399, 0.41, 0.14);
        StdDraw.filledCircle(0.601, 0.41, 0.14);

        double[] x = {0.45, 0.5, 0.55};
        double[] y = {0.2, 0.45, 0.2};

        StdDraw.filledPolygon(x, y);
    }
}
