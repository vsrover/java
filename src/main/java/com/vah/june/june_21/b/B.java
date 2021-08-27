package com.vah.june.june_21.b;

import com.vah.june.june_21.a.A;

public class B extends A {

    String a = "omg b";

    public static void main(String[] args) {
        A a  = new B();
        B b = new B();
        String a1 = b.a;
        System.out.println(a1);
    }
}
