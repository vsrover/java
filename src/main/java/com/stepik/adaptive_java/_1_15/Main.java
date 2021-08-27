package com.stepik.adaptive_java._1_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}
