package com.vah.may.may_14;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        char[] chars = new Scanner(System.in).nextLine().replaceAll("\\D+", "").toCharArray();

        List<Integer> collect = IntStream.range(0, chars.length).mapToObj(value -> chars[value])
                .map(Object::toString).map(Integer::parseInt).collect(Collectors.toList());

        int result = 0;
        for (int val : collect) {
            result = result + val;
        }
        System.out.println(result);
    }
}
