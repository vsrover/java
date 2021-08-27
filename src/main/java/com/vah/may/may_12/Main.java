package com.vah.may.may_12;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {


    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(getAnswer(n, m, k));
    }

    private static String getAnswer(int n, int m, int k) {
        if (n * m < k){
            return NO;
        }

        if (n * m == k){
            return YES;
        }

        if (n == k || m == k){
            return YES;
        }


        boolean b1 = IntStream.rangeClosed(1, n).anyMatch(value -> value * m == k);
        boolean b2 = IntStream.rangeClosed(1, m).anyMatch(value -> value * n == k);

        if (b1 || b2){
            return YES;
        }

        return NO;
    }
}
