package com.github.dhriti.sedgewick_wayne.ch1.s3;

public class P35_CheckSum {
    public static void main(String[] args) {
        int nineDigits = Integer.parseInt(args[0]);
        int nineDigitsCopy = nineDigits;
        int nineSum = 0;
        for (int i = 2; i < 11; ++i) {
            nineSum += i * (nineDigits % 10);
            nineDigits /= 10;
        }
        int tenthDigit = 11 - (nineSum % 11);
        if (tenthDigit == 10) System.out.println("ISBN Number: " + nineDigitsCopy + "X");
        else {
            int number = nineDigitsCopy * 10 + tenthDigit;
            System.out.println("ISBN Number: " + number);
        }
    }
}