package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P15_ClosestPoint {
    public static void main(String[] args) {
        double X = Double.parseDouble(args[0]);
        double Y = Double.parseDouble(args[1]);
        double Z = Double.parseDouble(args[2]);

        double closeX = 0;
        double closeY = 0;
        double closeZ = 0;
        double smallestdistance = Integer.MAX_VALUE;

        while (!StdIn.isEmpty()) {
            double tempX = StdIn.readDouble();
            double tempY = StdIn.readDouble();
            double tempZ = StdIn.readDouble();

            double distance = distanceSquared(X, Y, Z, tempX, tempY, tempZ);
            if (distance < smallestdistance) {
                smallestdistance = distance;
                closeX = tempX;
                closeY = tempY;
                closeZ = tempZ;
            }
        }

        System.out.println("The closest point is: (" + closeX + ", " + closeY +
                 ", " + closeZ + ")");
    }

    private static double distanceSquared(double x1, double y1, double z1,
                                          double x2, double y2, double z2) {
        double result = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2);
        return result;
    }
}
