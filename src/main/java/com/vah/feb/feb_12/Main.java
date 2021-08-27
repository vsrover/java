package com.vah.feb.feb_12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(1000));
    }


    public static int sum(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        int res = 0;

        for (Integer divisor : divisors) {
            res = res + divisor;
        }

        return res + n;
    }

}