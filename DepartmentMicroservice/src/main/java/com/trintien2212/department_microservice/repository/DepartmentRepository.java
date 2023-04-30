package com.trintien2212.department_microservice.repository;

import com.trintien2212.department_microservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findByDepartmentCode(String code);
}
