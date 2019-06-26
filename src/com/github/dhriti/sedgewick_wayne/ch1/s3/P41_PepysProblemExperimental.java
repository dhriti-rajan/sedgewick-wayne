package com.github.dhriti.sedgewick_wayne.ch1.s3;

public class P41_PepysProblemExperimental {
    public static void main(String[] args) {
        // Probability of at least one 1 in six rolls
        double count1 = 0;
        for (int i = 0; i < 100000; ++i) {
            boolean one = false;
            for (int j = 0; j < 6; ++j) {
                int roll = (int) (Math.random() * 6 + 1);
                if (roll == 1) one = true;
            }
            if (one) ++count1;
        }
        double sixRolls = count1/100000;

        // Probability of at least two 1's in twelve rolls
        double count2 = 0;
        for (int a = 0; a < 100000; ++a) {
            int oneCount = 0;
            for (int b = 0; b < 12; ++b) {
                int rollAgain = (int) (Math.random() * 6 + 1);
                if (rollAgain == 1) ++oneCount;
            }
            if (oneCount >= 2) ++count2;
        }
        double twelveRolls = count2/100000;

        System.out.println("The probability of getting at least one 1 when " +
                "rolling a die six times is " + sixRolls);
        System.out.println("The probability of getting at least two 1's when " +
                "rolling a die twelve times is " + twelveRolls);
    }
}
