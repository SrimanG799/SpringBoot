package com.ciq.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ciq.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> findAll();
	
	public Employee getById(Integer id);
	
	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Integer id);

}
