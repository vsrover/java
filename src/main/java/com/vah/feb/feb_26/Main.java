package com.vah.feb.feb_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Double> doubles = spliteratorWork(Arrays.asList(4d, 4d, 4d, 100d, 100d, 100d));
        print(doubles);

        List<Double> doubles2 = spliteratorWork(Arrays.asList(1d, 4d, 8d, 16d, 99d, 100d, 110d, 121d));
        print(doubles2);
    }

    public static List<Double> spliteratorWork(List<Double> lst) {
        return lst.stream()
                .filter(d -> d > 1)
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }

    public static void print(List<Double> list) {
        Spliterator<Double> doubleSpliterator = list.stream().spliterator();
        doubleSpliterator.trySplit().forEachRemaining(d -> {
            if (d >= 2 && d < 10) {
                System.out.println(d);
            }
        });
        System.out.println();
        doubleSpliterator.forEachRemaining(d -> {
            if (d >= 10) {
                System.out.println(d);
            }
        });
    }
}

class B {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            List<Integer> collect = Arrays.asList(reader.readLine().split(" ")).stream()
                    .map(Integer::parseInt)
                    .sorted().collect(Collectors.toList());

            collect.removeIf(integer -> integer % 2 == 0);

            collect.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}