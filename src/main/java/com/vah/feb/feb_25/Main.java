package com.vah.feb.feb_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            List<String> list = Arrays.asList(reader.readLine().split(" "));
            List<String> j = list.stream()
                    .filter(s -> s.startsWith("J"))
                    .map(s -> s.substring(1)).collect(Collectors.toList());

            ListIterator<String> itr = j.listIterator(j.size());

            while (itr.hasPrevious()) {
                System.out.println(itr.previous());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> noLongString(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }
}
