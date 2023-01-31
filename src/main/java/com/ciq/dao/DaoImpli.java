package com.ciq.dao;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.model.Employee;

@Repository
public class DaoImpli implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> findAll() {
		String sqlquery = "select * from employee";
		return jdbcTemplate.query(sqlquery, new BeanPropertyRowMapper(Employee.class));

		// TODO Auto-generated method stub

	}

	@Override
	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		String sqlquery = "select * from employee where id=?";
		return jdbcTemplate.queryForObject(sqlquery, new BeanPropertyRowMapper<>(Employee.class), new Object[] { id });
	}

	@Override
	public void save(Employee employee) {
		
		// TODO Auto-generated method stub
		
		String sql="insert into employee values(?,?,?,?,?)";
		jdbcTemplate.update(sql ,new Object[] {employee.getId(),employee.getName(),employee.getCompany(),employee.getRoll(),employee.getSalary()});
				
		

}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
		String sql="update employee set name=?,company=?,roll=?,salary=? where id=?";
		jdbcTemplate.update(sql ,new Object[] {employee.getName(),employee.getCompany(),employee.getRoll(),employee.getSalary(),employee.getId()});
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
		String sql="delete from employee where id=?";
		jdbcTemplate.update(sql,new Object[] {id});
		
	}

}
