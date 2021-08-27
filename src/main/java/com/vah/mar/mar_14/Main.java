package com.vah.mar.mar_14;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public static <E> Iterable<E> iterableOf(Stream<E> stream){
        return stream::iterator;
    }
}
