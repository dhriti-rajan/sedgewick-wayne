package com.github.dhriti.sedgewick_wayne.ch1.s3;

import java.util.ArrayList;
import java.util.Arrays;

// Different from P36_BetterPrimeCounter in that it uses the Sieve of Eratosthenes
// method for discovering prime numbers as opposed to checking if each individual
// number is prime and iterating through all potential factors each time.

public class P36_BestPrimeCounter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The number of primes less than or equal to " + n
            + " is: " + countPrimes(n));
    }

    static int countPrimes(int n) {
        boolean[] nonPrime = new boolean[n];
        Arrays.fill(nonPrime, false);

        ArrayList<Integer> primes = new ArrayList<>();

        for (int p = 2; p < n; ++p) {
            if (nonPrime[p]) {
                continue;
            }
            primes.add(p);
            for (int i = p; i < n; i += p) {
                nonPrime[i] = true;
            }
        }

        return primes.size();
    }
}
