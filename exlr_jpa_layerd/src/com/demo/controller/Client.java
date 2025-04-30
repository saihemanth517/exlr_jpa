package com.demo.controller;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Client {
	
	public static void main(String[] args) {
		
		EmployeeService service=new EmployeeServiceImpl();
		
//		creating employee object to insert the database
		
		Employee emp=new Employee(932, "pavan",10000.80, "hyd");
		Employee emp1=new Employee(123, "ravan",10000.80, "bdn");

		
//		service.addEmployee(emp);
		
		Employee employee=service.findByEmployeeId(932);
		System.out.println(employee);
		
	   employee.setEmpname("sandeep");
	   employee.setEmpsal(1200302.89);
     
//	   updating the  data
//      service.UpdateEmployee(employee);
//	   deleting the employee
	   
//	   service.deleteEmployee(employee);
	   
	   
	   
	}

}
