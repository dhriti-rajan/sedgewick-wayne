package com.github.dhriti.sedgewick_wayne.ch1.s2;

public class P32_ColorConversion {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double w = Math.max(r/255, Math.max(g/255, b/255));
        double c = (w - (r/255))/w;
        double m = (w - (g/255))/w;
        double y = (w - (b/255))/w;
        double k = 1 - w;

        System.out.println("CMYK Format: (" + c + ", " + m + ", " + y + ", " + k + ")");
    }
}
