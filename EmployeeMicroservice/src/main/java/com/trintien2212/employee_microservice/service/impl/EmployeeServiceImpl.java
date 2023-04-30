package com.trintien2212.employee_microservice.service.impl;

import com.trintien2212.employee_microservice.dto.APIResponseDto;
import com.trintien2212.employee_microservice.dto.EmployeeDto;
import com.trintien2212.employee_microservice.mapper.EmployeeMapper;
import com.trintien2212.employee_microservice.repository.EmployeeRepository;
import com.trintien2212.employee_microservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Setter
@Getter
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeMapper employeeMapper;
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        return employeeMapper.employeeToEmployeeDto(
                employeeRepository.save(
                        employeeMapper.employeeDtoToEmployee(employeeDto)));
    }

    @Override
    public APIResponseDto getEmployeeById(Long id) {
        return null;
    }
}
