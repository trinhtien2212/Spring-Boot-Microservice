package com.trintien2212.department_microservice.mapper;

import com.trintien2212.department_microservice.dto.DepartmentDto;
import com.trintien2212.department_microservice.entity.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    DepartmentDto departmentToDepartmentDto(Department department);
    Department departmentDtoToDepartment(DepartmentDto departmentDto);
}
