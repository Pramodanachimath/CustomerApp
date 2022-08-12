package com.employeeapp.client;

import com.employeeapp.service.EmployeeServiceImpl;
import com.employeeapp.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
      IEmployeeService employeeService=new EmployeeServiceImpl();
     System.out.println(employeeService.getAll());
     System.out.println(employeeService.getByDomain("Java"));
	}

}
