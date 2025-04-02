package com.exosolve.packageone;

public class AccessModifierRun {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"John");
        employee.setEmpName("Jane");
        System.out.println(employee.getEmpName());
        Tax tax = new Tax();
        tax.calculateTax();


    }
}
