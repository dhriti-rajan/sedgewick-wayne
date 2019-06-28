package com.github.dhriti.sedgewick_wayne.ch1.s3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P43_MedianOfFive {
    public static void main(String[] args) {
        int[] numberSet = new int[5];
        for (int i = 0; i < 5; ++i) {
            numberSet[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numberSet);
        int median = numberSet[2];
        System.out.println("The median of these five numbers is: " + median);
    }
}
