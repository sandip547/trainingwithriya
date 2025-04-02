package com.exosolve.packageone;

public class Employee {

    private int employeeId;
    private String empName;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", empName='" + empName + '\'' +
                '}';
    }

        private class ExtraRestrictedInfo{
            int empSalary;
        }
        Employee (){
            this(1,"Riya");
            System.out.println("Hello this is constructor overloading");

        }

    public Employee(int employeeId, String empName) {

        this.employeeId = employeeId;
        this.empName = empName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
