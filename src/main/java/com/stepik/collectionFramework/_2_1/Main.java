package com.stepik.collectionFramework._2_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> collect = Stream.of(847, 271, 663, 473, 376, 133, 693, 13, 382, 879).collect(Collectors.toList());
        Integer integer = maxElem(collect);
//        System.out.println(integer);


        List<String> collect1 = Stream.of("hi", "hello", "goodmorning", "ass").collect(Collectors.toList());
        List<String> strings = changeList(collect1);
        strings.forEach(System.out::println);
    }

    public static Integer maxElem(List<Integer> list) {
        return list.stream().max(Comparator.naturalOrder()).get();
    }

    static List<String> changeList(List<String> list) {
        String s = list.stream().max(Comparator.comparingInt(String::length)).get();
        List<String> omg = new ArrayList<>();
        list.forEach(s1 -> omg.add(s));
        return omg;
    }
}
