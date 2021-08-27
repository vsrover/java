package com.stepik.java_collections._1_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String aWord : words) {
            String word = aWord.toLowerCase();
            if (map.containsKey(word)) {
                int count = map.get(word) + 1;
                map.replace(word, count);
            } else {
                map.put(word, 1);
            }
        }

        Stream.of(words)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((s, aLong) -> System.out.println(s + " " + aLong));
    }
}
