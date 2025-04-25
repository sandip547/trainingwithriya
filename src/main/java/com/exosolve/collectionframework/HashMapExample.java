package com.exosolve.collectionframework;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Employee eOne = new Employee(UUID.randomUUID(),"riya","30","riya@gmail.com", List.of("999999999","888888888"));
        Employee eTwo = new Employee(UUID.randomUUID(),"riyan","31","riyan@gmail.com", List.of("999995999","888887888"));

        Employee eThree = new Employee(eTwo.getEmpId(),"riyannnn","37","riyan@gmail.com", List.of("999995999","888887888"));

        Map<UUID,Employee> map = new HashMap<>();
        map.put(eOne.getEmpId(),eOne);
        map.put(eTwo.getEmpId(),eTwo);
        map.put(eThree.getEmpId(),eThree);

        System.out.println(map.get(eTwo.getEmpId()));
//        for (UUID uid: map.keySet()){
//            System.out.println("emp id: " + uid);
//        }
//
//        for (Employee e: map.values()){
//            System.out.println(e.toString());
//        }

        System.out.println(map.containsKey(eOne.getEmpId()));
        System.out.println();
        for (Map.Entry<UUID,Employee> entry: map.entrySet()){
            System.out.println("key: " + entry.getKey() + "value: " + entry.getValue() );
        }

    }
}
