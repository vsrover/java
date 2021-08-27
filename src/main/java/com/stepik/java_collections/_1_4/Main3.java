package com.stepik.java_collections._1_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] chars = scanner.nextLine().toCharArray();
        char[] secret = scanner.nextLine().toCharArray();
        IntStream encryption = scanner.nextLine().chars();
        char[] decryption = scanner.nextLine().toCharArray();

        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i < chars.length ; i++) {
            map.put(chars[i],secret[i]);
        }
        encryption.forEach(c -> System.out.print(map.get((char)c)));
        System.out.println();
        for (char c : decryption) {
            for (Character key : map.keySet()) {
                if (map.get(key).equals(c)) {
                    System.out.print(key);
                }
            }
        }
    }
}
