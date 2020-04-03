package com.aleks.demo.controller;
import com.aleks.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    final EmployeeRepository EmployeeRepository;

    public EmployeeController(com.aleks.demo.repository.EmployeeRepository employeeRepository) {
        EmployeeRepository = employeeRepository;
    }
}
