//package com.vah.feb.feb_23.hakerrunk;
//
//import java.util.Scanner;
//
//public class Solution {
//    public static final MyCalculator my_calculator = new MyCalculator();
//    public static final Scanner in = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        while (in.hasNextInt()) {
//            int n = in.nextInt();
//            int p = in.nextInt();
//
//            try {
//                System.out.println(my_calculator.power(n, p));
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
//
//
//class MyCalculator {
//
//
//    public long power(int n, int p) throws Exception {
//
//        if (n == 0 || p == 0) {
//            throw new Exception("");
//        }
//
//        if (n < 0 || p < 0) {
//            throw new Exception("n or p should not be negative");
//        }
//
//        long result = n;
//        for (int i = 0; i < p - 1; i++) {
//
//            result = result * n;
//
//        }
//
////        return result;
//        return Math.pow(n, p);
//    }
//
//
//}
