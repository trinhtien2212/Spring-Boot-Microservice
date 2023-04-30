package com.trintien2212.employee_microservice.mapper;

import com.trintien2212.employee_microservice.dto.EmployeeDto;
import com.trintien2212.employee_microservice.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee employeeDtoToEmployee(EmployeeDto employeeDto);
    EmployeeDto employeeToEmployeeDto(Employee employee);
}
