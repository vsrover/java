package com.vah.feb.feb_26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int elementsSize = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < elementsSize; i++) {
            list.add(scanner.nextInt());
        }

        int queriesSize = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < queriesSize; i++) {
            String queryCode = scanner.nextLine();
            processByQueryCode(queryCode, list);
        }
    }

    private static void processByQueryCode(String queryCode, List<Integer> list) {
        if (queryCode.equals("Insert")) {
            String[] s = scanner.nextLine().split(" ");
            int index = Integer.parseInt(s[0]);
            int value = Integer.parseInt(s[1]);
            System.out.println("index: " + index + ", value: " + value);
            System.out.println("List before: " + list);
            list.add(index, value);
            System.out.println("List after: " + list);
        }

        if (queryCode.equals("Delete")) {

        }
    }
}
