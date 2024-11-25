package com.jwtsecurity.Service;


import com.jwtsecurity.model.Employee;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService
{
    private List<Employee> emplist = new ArrayList<>();

    public EmployeeService() {
        emplist.add(new Employee(UUID.randomUUID().toString(), "Rahul", "abc@gmail.com"));
        emplist.add(new Employee(UUID.randomUUID().toString(), "John Doe", "john.doe@gmail.com"));
        emplist.add(new Employee(UUID.randomUUID().toString(),"sumit", "sumit@gmail.com"));
    }

    public List<Employee> getAllEmployees() {
        return emplist;
    }

}
