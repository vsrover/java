package com.stepik.java_collections._1_6_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int columns = scan.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                innerList.add(scan.nextInt());
            }
            list.add(innerList);
        }

        int rotateCount = scan.nextInt();

        Collections.rotate(list, rotateCount);

        list.forEach(l -> System.out.println(l.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""))
        );

    }
}
