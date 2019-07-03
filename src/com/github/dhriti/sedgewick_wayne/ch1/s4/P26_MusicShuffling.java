package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P26_MusicShuffling {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] songs = new int[n];
        for (int i = 0; i < n; ++i) {
            songs[i] = i;
        }

        int count = 0;

        for (int j = 0; j < 100; ++j) {
            shuffle(songs);
            boolean ascending = false;
            for (int k = 1; k < n; ++k) {
                if (songs[k] == songs[k - 1] + 1) ascending = true;
            }
            if (!ascending) ++count;
        }

        double likelihood = count/100.0;
        System.out.println("The likelihood of not having any ascending songs is: " + likelihood);
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
