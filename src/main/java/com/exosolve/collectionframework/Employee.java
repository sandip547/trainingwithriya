package com.exosolve.collectionframework;

import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private UUID empId;
    private String empName;
    private String empAge;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getEmpId(), employee.getEmpId()) && Objects.equals(getEmpName(), employee.getEmpName()) && Objects.equals(getEmpAge(), employee.getEmpAge()) && Objects.equals(getEmail(), employee.getEmail());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge='" + empAge + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmpName(), getEmpAge(), getEmail());
    }
}
