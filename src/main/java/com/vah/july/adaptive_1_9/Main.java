package com.vah.july.adaptive_1_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextLine().chars().map(v -> (char) v)
                .map(Character::getNumericValue).sum();
        System.out.println(sum);
    }
}
