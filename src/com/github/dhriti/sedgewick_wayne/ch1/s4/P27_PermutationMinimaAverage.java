package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P27_PermutationMinimaAverage {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int[] set = new int[n];
        for (int i = 0; i < n; ++i) {
            set[i] = i;
        }

        int count = 0;

        for (int i = 0; i < m; ++i) {
            shuffle(set);

            int smallest = set[0];
            int subcount = 1;

            for (int j : set) {
                if (j < smallest) {
                    smallest = j;
                    ++subcount;
                }
            }
            count += subcount;
        }

        float average = (float) count/m;

        System.out.println("The average number of left to right minima in the" +
                " shuffled set is: " + average);
    }

    private static void shuffle(int[] songs) {
        int n = songs.length;

        for (int i = 0; i < n; ++i) {
            int r = i + (int) (Math.random() * (n - i));
            int temp = songs[i];
            songs[i] = songs[r];
            songs[r] = temp;
        }
    }
}
