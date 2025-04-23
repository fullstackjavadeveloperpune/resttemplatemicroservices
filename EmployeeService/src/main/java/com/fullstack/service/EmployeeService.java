package com.fullstack.service;

import com.fullstack.entity.Employee;
import com.fullstack.repository.EmployeeRepository;
import com.fullstack.vo.Department;
import com.fullstack.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);


    }

    public RestTemplateVO findById(int empId) {

        RestTemplateVO restTemplateVO = new RestTemplateVO();

        Employee employee = employeeRepository.findByEmpId(empId);

        restTemplateVO.setEmployee(employee);

        // Service Communication
        Department department = restTemplate.getForObject("http://DepartmentService/departments/findbyid/" + employee.getDeptId(), Department.class);

        restTemplateVO.setDepartment(department);

        return restTemplateVO;
    }
}
