package com.github.dhriti.sedgewick_wayne.ch1.s3;

// Different from P36_BestPrimeCounter in that it does not use the Sieve of
// Eratosthenes method for determining primes, but instead iterates through each
// possible factor of each number to determine whether or not it is prime.

public class P36_BasicPrimeCounter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The number of primes less than or equal to " + n
                + " is: " + countPrimes(n));
    }

    static int countPrimes(int n) {
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
