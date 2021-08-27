package com.vah.feb.feb_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            String[] s = scanner.nextLine().split(" ");
            for (String value : s) {
                list.add(Integer.parseInt(value));
            }
            lists.add(list);
        }
        System.out.println(n);
    }
}
