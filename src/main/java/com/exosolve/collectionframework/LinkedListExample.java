package com.exosolve.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) throws InterruptedException {
        List<String> strings = new LinkedList<>();



        //nodes
        //node0 -> node1-> node2
        //node0 - "apple", reference to node 1 or points to node 1

        // singly linked list
        // doubly linked list    nod1 and node 2    node ->  <- node 2
        //circular linked list  firstNode      lastNode -> firstNode
        // doubly circular linked list

        strings.add("apple");
        strings.add("banana");
        strings.add("watermelon");
        strings.add(1,"coconut");
        System.out.println(strings);
        for (String s: strings){
            System.out.println(s);
        }

        List<Long> arrayList = new ArrayList<>();
       // int a = 5/0;
        for (long i=0;i<10000000;i++){
            arrayList.add(i);
         }

        List<Long> linkedList = new LinkedList<>();

        for (long i=0;i<10000000;i++){
            linkedList.add(i);
        }

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        arrayList.get(7000000);


        long endTime =  System.currentTimeMillis();
        System.out.println(endTime-startTime);

        System.out.println("the processing has been finnished");
        Thread.sleep(2000);

        long startTimel = System.currentTimeMillis();
        System.out.println(startTimel);
        linkedList.get(100000);
        long endTimel =  System.currentTimeMillis();
        System.out.println(endTimel-startTimel);



    }
}
