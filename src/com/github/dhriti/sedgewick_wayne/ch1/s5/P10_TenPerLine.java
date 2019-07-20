package com.github.dhriti.sedgewick_wayne.ch1.s5;

import edu.princeton.cs.introcs.StdIn;

public class P10_TenPerLine {
    public static void main(String[] args) {
        int[] numberList = StdIn.readAllInts();
        int counter = 0;
        int index = 0;
        while (index < numberList.length) {
            if (counter < 10) {
                System.out.print(numberList[index] + " ");
                ++counter;
                ++index;
            } else {
                counter = 0;
                System.out.println();
            }
        }
    }
}