package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P25_BadShuffling {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[][] results = new int[m][m];

        int[] deck = new int[m];

        for (int i = 0; i < m; ++i) {
            deck[i] = i;
        }

        for (int i = 0; i < n; ++i) {
            shuffle(deck);

            for (int k = 0; k < deck.length; ++k) {
                ++results[deck[k]][k];
//                System.out.print(deck[k] + " ");
            }
//            System.out.println();

            for (int a = 0; a < m; ++a) {
                deck[a] = a;
            }
        }

        for (int a = 0; a < m; ++a) {
            for (int b = 0; b < m; ++b) {
                System.out.printf("%3d ", results[a][b]);
            }
            System.out.println();
        }
    }

    private static void shuffle(int[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; ++i) {
            int r = (int) (Math.random() * (n));
            int temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }
}
