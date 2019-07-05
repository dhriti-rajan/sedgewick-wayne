package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P28_InversePermutation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        int[] b = inversePermutation(a);

        for (int i : a) System.out.print(i + " ");

        System.out.println();

        for (int i : b) System.out.print(i + " ");
    }

    private static int[] inversePermutation(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == i) {
                    b[i] = j;
                    break;
                }
            }
        }

        return b;
    }
}
