package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;

public interface IEmployeeService {
  List<Employee> getAll();
  List<Employee> getCity(String city);
  List<Employee> getByDomain(String domain);
 Employee getById(int employeeId);
   
}
