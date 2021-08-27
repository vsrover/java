package com.stepik.adaptive_java._1_33;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        double v = IntStream.rangeClosed(i1, i2)
                .filter(value -> value % 3 == 0).average().orElse(0.0);
        System.out.println(v);
    }
}
