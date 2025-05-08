package com.exosolve.streamApi;


import com.exosolve.collectionframework.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> lit = new ArrayList<>();
        for (int i=30;i>=1;i--){
            lit.add(i);
        }

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(UUID.randomUUID(),"Riya","55","riya@gmail.com"));
        employeeList.add(new Employee(UUID.randomUUID(),"Riyan","20","riyan@gmail.com"));
        employeeList.add(new Employee(UUID.randomUUID(),"Riyan","20","riyan@gmail.com"));

        // Employee E = new Employee(UUID.randomUUID(),"Riyan","24","riyanhm@gmail.com");
      List<String> lizS = employeeList.stream().map(n->n.getEmpAge()+1).filter(n->n.equals("201")).sorted().collect(Collectors.toList());
        System.out.println(lizS);

    }
}
