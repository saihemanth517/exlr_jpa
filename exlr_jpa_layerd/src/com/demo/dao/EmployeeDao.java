package com.demo.dao;

import com.demo.model.Employee;

public interface EmployeeDao {
	
	Employee getEmployeeById(int empid);
	
     void addEmployee(Employee emp);
	
	void UpdateEmployee(Employee emp);
	
	void deleteEmployee(Employee emp);
	
	void beginTransaction();
	
	void commmiTransaction();
	

}
