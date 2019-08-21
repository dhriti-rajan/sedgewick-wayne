package com.github.dhriti.sedgewick_wayne.ch1.s5;

public class P22_Banner {
    private static void rotate(StringBuilder builder) {
        char last = builder.charAt(builder.length() - 1);
        builder.deleteCharAt(builder.length() - 1);
        builder.insert(0, last);
    }

    public static void main(String[] args) throws InterruptedException {
        String message = args[0];
        double speed = Double.parseDouble(args[1]);

        StringBuilder builder = new StringBuilder(80);
        builder.append(" ".repeat(builder.capacity()));
        builder.replace(0, message.length(), message);

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.print(builder.toString());
            Thread.sleep((int) (1000 / speed));
            System.out.print('\r');
            rotate(builder);
        }
    }
}
