package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

// Note: This code is copied from the problem statement in the book in section 1.5

public class P9_Dragon {
    public static void main(String[] args) {
        String dragon = StdIn.readString();
        String nogard = StdIn.readString();
        StdOut.print(dragon + "L" + nogard);
        StdOut.print(" ");
        StdOut.print(dragon + "R" + nogard);
        StdOut.println();
    }
}
