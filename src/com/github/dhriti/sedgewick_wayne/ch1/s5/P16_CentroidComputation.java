package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P16_CentroidComputation {
    public static void main(String[] args) {
        double m = 0;
        double x = 0;
        double y = 0;

        while (!StdIn.isEmpty()) {
            double xTemp = StdIn.readDouble();
            double yTemp = StdIn.readDouble();
            double mTemp = StdIn.readDouble();

            m += mTemp;
            x += mTemp * xTemp;
            y += mTemp * yTemp;
        }

        x /= m;
        y /= m;

        System.out.println("(" + x + ", " + y + ", " + m + ")");
    }
}
