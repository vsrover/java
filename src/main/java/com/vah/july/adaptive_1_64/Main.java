package com.vah.july.adaptive_1_64;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] sArr = s.split(" ");
        String s1 = sArr[0];
        String s2 = sArr[1];
        int res = 100 - Integer.parseInt(s2) + 2016;
        System.out.printf("%s, You will be 100 years old in %s year.\n%n", s1, res);
    }
}
