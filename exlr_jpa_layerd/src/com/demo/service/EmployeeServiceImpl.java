package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
//	crreatinfg dao object in serive
	
	private EmployeeDao dao;
	
	
	
	public EmployeeServiceImpl()
	{
		dao=new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commmiTransaction();
		
			}

	@Override
	public void UpdateEmployee(Employee emp) {
		
		dao.beginTransaction();
		dao.UpdateEmployee(emp);
		dao.commmiTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commmiTransaction();
		
	}

	@Override
	public Employee findByEmployeeId(int empid) {
		
	Employee femp=dao.getEmployeeById(empid);
		
		return femp;
	}

}
