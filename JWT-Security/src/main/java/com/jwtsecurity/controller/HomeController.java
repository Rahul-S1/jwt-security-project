package com.jwtsecurity.controller;


import com.jwtsecurity.Service.EmployeeService;
import com.jwtsecurity.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/welcome")
public class HomeController
{

    private final EmployeeService employeeService;

    @GetMapping("/getemployee")
    public List<Employee> getEmpployee()
    {
        return employeeService.getAllEmployees();
    }


}
