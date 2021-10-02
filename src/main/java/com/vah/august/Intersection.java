package com.vah.august;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

//        list1.add("A");
//        list1.add("B");
        list1.add("C");
//        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("E");


        boolean b = list1.retainAll(list2);
        System.out.println(list1);

    }
}
