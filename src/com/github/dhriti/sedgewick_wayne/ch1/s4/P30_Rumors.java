package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P30_Rumors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Alice is the person in the 0th index
        int[] people = new int[n];

        int trials = Integer.parseInt(args[1]);

        int previousIndex = 0;

        int averageIterations = 0;
        double allHearRumor = 0;

        for (int i = 0; i < trials; ++i) {
            int person = (int) (Math.random() * (n - 1)) + 1;
            while (person == previousIndex) {
                person = (int) (Math.random() * (n - 1)) + 1;
            }

            while (people[person] < 1) {
                ++averageIterations;
                ++people[person];

                previousIndex = person;

                while (person == previousIndex) {
                    person = (int) (Math.random() * (n - 1)) + 1;
                }
            }

            boolean allHeard = true;

            for (int a = 1; a < n; ++a) {
                if (people[a] == 0) allHeard = false;
            }

            if (allHeard) ++allHearRumor;


            previousIndex = 0;

            for (int j = 0; j < n; ++j) {
                people[j] = 0;
            }
        }

        averageIterations /= trials;

        allHearRumor /= trials;

        System.out.println("The expected number of people that will hear the" +
                " rumor is: " + averageIterations);
        System.out.println("The probability that everyone other than Alice hears" +
                " the rumor is: " + allHearRumor);
    }
}
