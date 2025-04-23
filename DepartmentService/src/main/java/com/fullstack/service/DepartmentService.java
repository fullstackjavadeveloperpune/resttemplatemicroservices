package com.fullstack.service;

import com.fullstack.entity.Department;
import com.fullstack.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department){
        return departmentRepository.save(department);
    }

    public Optional<Department> findById(int deptId){
        return departmentRepository.findById(deptId);
    }
}
