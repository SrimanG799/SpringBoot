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
import com.ciq.model.ResponseBean;
import com.ciq.service.EmpService;
@RestController
public class ResponseBeanController {
	
	@Autowired
	EmpService empService;
	@GetMapping("/rhello")
	public String helloWorld()
	{
		return "hello world";
	}
	@GetMapping("/rgetEmp")
	public ResponseBean employe()
	{
		try {
		return new ResponseBean(200, empService.findAll());
		
		
	}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseBean(404, e.getLocalizedMessage());
		}
	}
	@GetMapping("/rgetId/{id}")
	public ResponseBean getbyId(@PathVariable("id") Integer id)
	{
		try {
		return new ResponseBean(200, empService.getById(id));
		
	}
		catch (Exception e) {
			// TODO: handle exception
		
		return new ResponseBean(404, "data is not available with given id");
		}
	}	
		
	@PostMapping("/rinsert")
	public ResponseBean save(@RequestBody Employee employee)
	{
		try {
			empService.save(employee);
			return new ResponseBean(200,"succesfully saved");
			
		}
		catch (Exception e) {
			// TODO: handle exception
		
		return new ResponseBean(404, e.getLocalizedMessage());
		}
	}
	@PutMapping("/rupd")
	public ResponseBean update(@RequestBody Employee employee)
	{
		try {
			empService.update(employee);
		return new ResponseBean(200, "successfully updated");
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseBean(404,e.getLocalizedMessage());
		}
	
	}
	@DeleteMapping("/rdeleteId/{id}")
	public ResponseBean delete(@PathVariable("id") Integer id)
	{
		try {
			empService.delete(id);
		return new ResponseBean(200, "deleted");
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseBean(404, e.getLocalizedMessage()) ;
		}
		
	}


}
