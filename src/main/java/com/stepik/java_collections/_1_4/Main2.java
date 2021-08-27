package com.stepik.java_collections._1_4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        Set<String> lib = new HashSet<>();
        for (int j = 0; j < i; j++) {
            String s = scanner.nextLine();
            lib.add(s.toLowerCase());
        }
        int i1 = scanner.nextInt();
        scanner.nextLine();
        Set<String> enorm = new LinkedHashSet<>();
        for (int j = 0; j < i1; j++) {
            String[] s = scanner.nextLine().split(" ");
            for (String value : s) {
                if (!lib.contains(value.toLowerCase())) {
                    enorm.add(value);
                }
            }
        }
        enorm.forEach(System.out::println);
    }
}
