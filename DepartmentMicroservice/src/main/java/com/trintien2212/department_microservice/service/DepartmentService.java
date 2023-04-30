package com.trintien2212.department_microservice.service;

import com.trintien2212.department_microservice.dto.DepartmentDto;
import com.trintien2212.department_microservice.mapper.DepartmentMapper;
import com.trintien2212.department_microservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartmentService {

    private DepartmentRepository departmentRepository;
    private DepartmentMapper departmentMapper;
    public DepartmentDto addDepartment(DepartmentDto departmentDto){
        return departmentMapper
                .departmentToDepartmentDto(
                        departmentRepository.save(
                                departmentMapper.departmentDtoToDepartment(
                                        departmentDto)));
    }
    public List<DepartmentDto> getAllDepartments(){
        return departmentRepository.findAll().stream().map(
                department -> departmentMapper.departmentToDepartmentDto(department)
        ).collect(Collectors.toList());
    }
    public DepartmentDto findDepartmentByCode(String code){
        return departmentMapper
                .departmentToDepartmentDto(
                        departmentRepository.findByDepartmentCode(code));
    }
}
