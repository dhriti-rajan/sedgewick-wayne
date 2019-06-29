package com.github.dhriti.sedgewick_wayne.ch1.s3;

public class P45_Chaos {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        int time = Integer.parseInt(args[2]);
        for (int i = 0; i < time; ++i) {
            x = r * x * (1 - x);
        }
        System.out.println("The population after " + time + " years is " + x);
    }
}
