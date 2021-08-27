package com.stepik.collectionFramework._2_7;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> integers = symDifference(set1, set2);
        integers.forEach(System.out::println);
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> generalSet1 = new HashSet<>(set1);
        Set<Integer> generalSet2 = new HashSet<>(set2);
        generalSet1.addAll(generalSet2);
        set1.retainAll(set2);
        generalSet1.removeAll(set1);
        return generalSet1;
    }
}
