package com.vah.feb.feb_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");
        List<Integer> helpList = getList();
        Set<Integer> set = new HashSet<>();
        for (String s : strings) {
            set.add(Integer.parseInt(s));
        }
        set.addAll(helpList);
        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        return set.stream().filter(v -> v <= 10).collect(Collectors.toSet());
    }

    public static List<Integer> getList(){
        return new ArrayList<>();
    }
}
