package com.vah.may.may_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()){
            int val = Integer.parseInt(scanner.next());
            if (val == 0){
                break;
            }
            list.add(val);
        }
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
