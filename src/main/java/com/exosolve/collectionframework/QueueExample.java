package com.exosolve.collectionframework;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> names = new ArrayDeque<>();
        names.add("laptop");
        names.add("mobile");
        System.out.println(names.poll());

        System.out.println(names);

        

    }
}
