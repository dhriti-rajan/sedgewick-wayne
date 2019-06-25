package com.github.dhriti.sedgewick_wayne.ch1.s3;

// Different from P36_BetterPrimeCounter in that it does not use the Sieve of
// Eratosthenes method for determining primes, but instead iterates through each
// possible factor of each number to determine whether or not it is prime.

public class P36_PrimeCounter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 100000; i < 1000001; i += 100000) {
            benchmark(i);
        }
    }

    // For comparison to P36_BetterPrimeCounter in terms of efficiency
    private static void benchmark(int n) {
        long start = System.currentTimeMillis();
        int count = countPrimes(n);
        float elapsed = System.currentTimeMillis() - start;

        System.out.println("#primes < " + n + " = " + count + ", "
                + elapsed / 1000 + " seconds elapsed");
    }

    private static int countPrimes(int n) {
        int primes = 0;

        for (int i = 2; i <= n; ++i) {
            if (isPrime(i)) ++primes;
        }
        return primes;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }
}