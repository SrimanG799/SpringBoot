package com.ciq.service;

import java.util.List;

import com.ciq.model.Employee;

public interface EmpService {
	
	public List<Employee> findAll();
	public Employee getById(Integer id);
	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Integer id);




}
