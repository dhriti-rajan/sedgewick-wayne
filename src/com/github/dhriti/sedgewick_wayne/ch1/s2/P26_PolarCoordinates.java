package com.github.dhriti.sedgewick_wayne.ch1.s2;

public class P26_PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(x * x + y * y);
        double t = Math.atan(y/x);
        System.out.println("Polar Coordinates: (" + r + ", " + t + ")");
    }
}
