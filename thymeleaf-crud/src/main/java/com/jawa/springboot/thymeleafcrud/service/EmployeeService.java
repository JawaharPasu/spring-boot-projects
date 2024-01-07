package com.jawa.springboot.thymeleafcrud.service;

import com.jawa.springboot.thymeleafcrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
