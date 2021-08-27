package com.vah.july.adaptive_1_25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            int i = Integer.parseInt(s);
            if (i >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
