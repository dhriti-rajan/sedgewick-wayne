package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P12_Table {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            double quotient = 1.0 * a / b;
            System.out.print(name + " " + a + " " + b + " ");
            System.out.printf("%.3f", quotient);
            System.out.println();
        }
    }
}