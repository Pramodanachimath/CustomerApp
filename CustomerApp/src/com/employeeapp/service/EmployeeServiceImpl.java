package com.employeeapp.service;

import java.util.ArrayList;
import java.util.List;

import com.employeeapp.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public List<Employee> getAll() {
		
		return showAll();
	}

	@Override
	public List<Employee> getCity(String city) {
		List<Employee> employeeList=showAll();
		List<Employee> employeeByCity =new ArrayList<>();
		
		for(Employee employee:employeeByCity) {
			if(employee.getCity().equals(employeeList)) {
				employeeByCity.add(employee);
			}
		}
		return employeeByCity;
	}

	@Override
	public List<Employee> getByDomain(String domain) {
		List<Employee> employeeList=showAll();
		List<Employee> employeeByDomain =new ArrayList<>();
		
		for(Employee employee:employeeList) {
			if(employee.getDomain().equals(domain)) {
				employeeByDomain.add(employee);
			}
		}
		return employeeByDomain;
		
	}

	@Override
	public Employee getById(int employeeId) {
		List<Employee> employeeList=showAll();
		for(Employee employee:employeeList) {
			if(employee.getEmployeeId()==employeeId) {
				return employee;
			}
		}
		return null;
	}

	private List<Employee> showAll(){
		
		Employee employee1=new Employee("Pramod", 301, "Java", "Bijapur");
		Employee employee2=new Employee("Pam", 302, "FrameWork", "Banglore");
		Employee employee3=new Employee("Virat", 303, "Digital", "Davanagere");
		Employee employee4=new Employee("Rohit", 304, "DotNet", "Udupi");
		Employee employee5=new Employee("Sita", 305, "DataBase", "Gulbarga");
		
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		 
		
		return employeeList;
		
	}
}
