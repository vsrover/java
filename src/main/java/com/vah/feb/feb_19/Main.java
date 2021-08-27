package com.vah.feb.feb_19;

public class Main {

    int k;
    int n;

    public Main() {
//        this(1);
        this(1, 2);
    }

    public Main(int k) {
        this(1, 2);
        this.k = k;
    }

    public Main(int k, int n) {
        this.k = k;
        this.n = n;
    }
}


class Parent {
    String i;

    public Parent(String i) {
        this.i = i;
    }
}

class Child extends Parent {
    String i;

    public Child() {
        super("www");
        String s = super.i;
    }

    public Child(String i) {
        this();
    }
}


