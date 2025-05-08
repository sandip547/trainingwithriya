package com.exosolve.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSortingExample {
    public static void main(String[] args) {
        ArrayList<Payment> list = new ArrayList<>();
        list.add(new Payment(1,"Credit Card",500));
        list.add(new Payment(35,"Debit Card",5000));
        list.add(new Payment(6,"Stripe",200));
        Comparator<Payment> comparator = new Comparator<Payment>() {
            @Override
            public int compare(Payment o1, Payment o2) {
                return Integer.compare(o1.getPaymentAmount(),o2.getPaymentAmount()); // Example
            }
        };

        Comparator<Payment> reversePayment = comparator.reversed();

        Collections.sort(list,reversePayment);
        System.out.println(list);


    }
}
