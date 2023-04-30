package com.trintien2212.employee_microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String departmentCode;
    private String organizationCode;
}
