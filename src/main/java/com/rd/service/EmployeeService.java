package com.rd.service;

import java.util.List;

import com.rd.entity.Employee;

public interface EmployeeService {
	
	 public  List<Employee>  getAllEmployees();
     public  String  registerEmployee(Employee emp); 
     public  Employee   getEmployeeByNo(int no);
     public  String   editEmployee(Employee emp);
     public  String   deleteEmployee(int no);

}
