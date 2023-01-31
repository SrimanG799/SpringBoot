package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.model.Employee;
import com.ciq.service.EmpService;

@RestController
public class EmployeeController {
	@Autowired
	EmpService empService;
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "hello world";
	}
	
	@GetMapping("/getEmp")
	public List<Employee> employe()
	{
		return empService.findAll();
		
	}
	
	
	@GetMapping("/getId/{id}")
	public Employee getbyId(@PathVariable("id") Integer id)
	{
		return empService.getById(id);
		
	}
	
	@PostMapping("/insert")
	public void save(@RequestBody Employee employee)
	{
		empService.save(employee);
	}
	
	@PutMapping("/upd")
	public void update(@RequestBody Employee employee)
	{
		empService.update(employee);
	}
	@DeleteMapping("/deleteId/{id}")
	public void delete(@PathVariable("id") Integer id)
	{
		empService.delete(id);
	}

}
