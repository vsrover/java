package com.vah.mar.mar_15;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int factorial = factorial(1);
        System.out.println(factorial);

        new B(null);
    }

    static int factorial(int n) {
        assert (n >= 0);

        assert (n <= 10);

        if (n < 2) {
            return 1;
        }

        return factorial(n - 1) * n;
    }
}


class B {

    public B(String s) {
        String omg = Objects.requireNonNull(s, "OMG");
    }
}