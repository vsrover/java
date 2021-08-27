package com.vah.july;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long count = s.toLowerCase().chars().filter(c ->
                c == 'c' || c == 'g').count();
        System.out.println((double) count / s.length() * 100);
    }
}
