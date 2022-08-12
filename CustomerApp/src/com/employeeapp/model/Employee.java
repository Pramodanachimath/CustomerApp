package com.employeeapp.model;

public class Employee {
   private String name;
   private int employeeId;
   private String domain;
   private String city;
public Employee(String name, int employeeId, String domain, String city) {
	super();
	this.name = name;
	this.employeeId = employeeId;
	this.domain = domain;
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", employeeId=" + employeeId + ", domain=" + domain + ", city=" + city + "]";
}
   
}
