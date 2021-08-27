package com.vah.feb.feb_23.stepik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String allElements = reader.readLine();
        List<Integer> bigList = createBigList(allElements);

        ArrayList<Integer> div2list = new ArrayList<>();
        ArrayList<Integer> div3list = new ArrayList<>();
        ArrayList<Integer> otherlist = new ArrayList<>();

        for (int v : bigList) {
            if (v % 2 == 0 && v % 3 == 0) {
                div2list.add(v);
                div3list.add(v);
            }

            else if (v % 2 == 0) {
                div2list.add(v);
            }

            else if (v % 3 == 0) {
                div3list.add(v);
            }

            else {
                otherlist.add(v);
            }
        }

        List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

        printInLine(resultList);
    }

    public static List<Integer> createBigList(String str) {
        List<Integer> bigList = new ArrayList<Integer>();
        String[] strarr = str.split(" ");

        for (String s : strarr) {
            bigList.add(Integer.parseInt(s));
        }
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list,
                                                        List<Integer> div3list,
                                                        List<Integer> otherList) {
        List<List<Integer>> resultList = new ArrayList<>();
        Collections.sort(div2list);
        Collections.sort(div3list);
        Collections.sort(otherList);
        resultList.add(div2list);
        resultList.add(div3list);
        resultList.add(otherList);
        return resultList;
    }

    public static void printInLine(List<List<Integer>> resultList) {
        resultList.forEach(System.out::println);
    }
}
