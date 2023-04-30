package com.trintien2212.employee_microservice.service;

import com.trintien2212.employee_microservice.dto.APIResponseDto;
import com.trintien2212.employee_microservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long id);
}
