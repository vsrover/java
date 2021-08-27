package com.vah.may.may_13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float v = scanner.nextFloat();
        int power = scanner.nextInt();
        if (power % 2 == 0) {
            System.out.println(getEvenVal(v, power));
        } else {
            System.out.println(getVal(v, power));
        }
    }

    private static float getVal(float v, int power) {
        if (power != 0) {
            return v * getVal(v, power - 1);
        } else {
            return 1;
        }
    }

    private static float getEvenVal(float v, int power) {
        if (power != 0) {
            return v * getVal(v, power / 2);
        } else {
            return 1;
        }
    }
}
