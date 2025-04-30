package com.demo.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	
//	creating entitiy object to get data from datrabase
	private EntityManager entity;
	
	public EmployeeDaoImpl()
	{
		entity=JPAUtil.getEntityManager();
	}

	@Override
	public Employee getEmployeeById(int empid) {
Employee getemp	=entity.find(Employee.class, empid);
		return getemp;
	}

	@Override
	public void addEmployee(Employee emp) {
		entity.persist(emp);
		
	}

	@Override
	public void UpdateEmployee(Employee emp) {
		entity.merge(emp );
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		entity.remove(emp);
		
	}

	@Override
	public void beginTransaction() {
		entity.getTransaction().begin();	
	}

	@Override
	public void commmiTransaction() {
		entity.getTransaction().commit();
				
	}

}
