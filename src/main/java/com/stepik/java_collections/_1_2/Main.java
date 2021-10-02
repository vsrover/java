package com.stepik.java_collections._1_2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (!stack.empty()) {
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                }
            } else if (c == ')' || c == ']' || c == '}' && stack.empty()) {
                stack.push(c);
            }
        }

        if (stack.empty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
