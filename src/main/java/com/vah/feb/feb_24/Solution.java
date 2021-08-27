package com.vah.feb.feb_24;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    static <Д> void напечатать(Д[] arr) {
        Stream.of(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        String[] str = {"a", "b", "c"};
        Integer[] integers = {1, 2, 4};

        напечатать(str);
        напечатать(integers);
        String s = "omg";
        IntStream chars = s.chars();
    }
}
