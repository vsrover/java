package com.vah.july.adaptive_1_51;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int i = scanner.nextInt();
            if (i == 0) {
                double v = list.stream().mapToDouble(d -> d).average().orElse(0.0);
//                System.out.println(new DecimalFormat("#0.00000000000").format(v));
                System.out.println(v);
                return;
            }
            list.add(i);
        }
    }
}
