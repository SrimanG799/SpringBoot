package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDao;
import com.ciq.model.Employee;
@Service
public class ServiceImpli implements EmpService {

	@Autowired
	
	EmployeeDao employeeDao;
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
	@Override
	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.getById(id);
	}
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		
	}
	public void update(Employee employee) {
		employeeDao.update(employee);
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
		employeeDao.delete(id);
		
	}

}
