package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class P21_RoseCurves {
    public static void main(String[] args) {
        StdDraw.setPenColor(Color.black);
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-2, 2);
        StdDraw.setYscale(-2, 2);

        for (double theta = 0; theta < 2 * Math.PI; theta += 0.001) {
            StdDraw.filledCircle(function(theta, n) * Math.cos(theta), function(theta, n) * Math.sin(theta), 0.01);
        }


    }

    private static double function (double theta, int n) {
        return Math.sin(n * theta);
    }
}
