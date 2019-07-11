package com.github.dhriti.sedgewick_wayne.ch1.s4;

public class P38_BirthdayProblem {
    public static void main(String[] args) {
        int[] birthdays = new int[365];

        int totalPeople = 0;

        while (noDuplicates(birthdays)) {
            int day = (int) (Math.random() * 365);
            ++birthdays[day];
            ++totalPeople;
        }

        System.out.println(totalPeople);
    }

    private static boolean noDuplicates(int[] birthdays) {
        for (int people : birthdays) {
            if (people > 1) return false;
        }
        return true;
    }
}
