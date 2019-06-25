package com.github.dhriti.sedgewick_wayne.ch1.s3;

import java.util.function.Function;

public class PrimeCounterTimeCheck {
    private static class Pair {
        int value;
        float seconds;
    }

    private static Pair benchmark(int n, Function<Integer, Integer> function) {
        Pair result = new Pair();

        long start = System.currentTimeMillis();
        result.value = function.apply(n);
        long elapsed = System.currentTimeMillis() - start;
        result.seconds = elapsed / 1000.0F;
        return result;
    }

    public static void main(String[] args) {
        for (int n = 100_000; n < 10_000_000; n += 100_000) {
            Pair basic = benchmark(n, P36_BasicPrimeCounter::countPrimes);
            Pair better = benchmark(n, P36_BetterPrimeCounter::countPrimes);
            Pair best = benchmark(n, P36_BestPrimeCounter::countPrimes);

            System.out.println("n: " + n
                    + ", basic: " + basic.value + " (" + basic.seconds + "s)"
                    + ", better: " + better.value + " (" + better.seconds + "s)"
                    + ", best: " + best.value + " (" + best.seconds + "s)");
        }
    }
}
