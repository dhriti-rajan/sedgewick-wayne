package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P27_PermutationMinima {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] set = new int[n];
        for (int i = 0; i < n; ++i) {
            set[i] = i;
        }

        shuffle(set);

        int smallest = set[0];
        int count = 1;

        for (int i : set) {
            if (i < smallest) {
                smallest = i;
                ++count;
            }
        }

        for (int i : set) System.out.print(i + " ");
        System.out.println();

        System.out.println("The number of left to right minima in the shuffled" +
                " set is: " + count);
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
