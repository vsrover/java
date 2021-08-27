package com.vah.june.june_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        crazyLoop();
        try (Scanner scanner = new Scanner(System.in)) {

        }
    }

    static void crazyLoop() {
        var c = 0;
//        JACK:
        while (c < 8) {
//            JILL:
            System.out.println(c);
            if (c > 3) break;
            else c++;
        }
    }
}
