package com.github.dhriti.sedgewick_wayne.ch1.s3;

import java.util.ArrayList;

public class P34_RamanujansTaxi {
    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        int m = 1;
//        for (int a = 0; a < m; ++a) {
//            for (int b = 0; b < m; ++b) {
//                for (int c = 0; c < m; ++c) {
//                    for (int d = 0; d < m; ++d) {
//                        if (a * a * a + b * b * b == c * c * c + d * d * d && c * c * c + d * d * d == m) {
//                            System.out.println(m);
//                        }
//                    }
//                }
//            }
//            if (m < n) ++m;
//            else break;
//        }
        int n = Integer.parseInt(args[0]);
        for (int a = 3; a < Math.cbrt(n); ++a) {
            for (int b = 2; b < a; ++b) {
                for (int c = 1; c < b; ++c) {
                    for (int d = 0; d < c; ++d) {
                        if (Math.pow(a, 3) + Math.pow(d, 3) == Math.pow(b, 3) + Math.pow(c, 3)) {
                            System.out.println(Math.pow(a, 3) + Math.pow(d, 3));
                        }
                    }
                }
            }
        }
    }
}
