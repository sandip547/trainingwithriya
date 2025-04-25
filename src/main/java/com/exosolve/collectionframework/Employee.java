package com.exosolve.collectionframework;

import lombok.*;

import java.util.List;
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
    private List<String> mobileNumber;

}
