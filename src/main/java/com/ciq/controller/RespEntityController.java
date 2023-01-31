package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class RespEntityController {
	
	@Autowired
	EmpService empService;
	@GetMapping("/rehello")
	public String helloWorld()
	{
		return "hello world";
	}
	@GetMapping("/regetEmp")
	public ResponseEntity<?> employe()
	{
		
		return new ResponseEntity<>(HttpStatus.OK).ok(empService.findAll());
		
		
	
	}
	@GetMapping("/regetId/{id}")
	public ResponseEntity<?> getbyId(@PathVariable("id") Integer id)
	{

		try {
		return new ResponseEntity(HttpStatus.OK).ok(empService.getById(id));
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity(HttpStatus.NOT_FOUND).ok("not records on given id");
		}
	}	
		
		
	@PostMapping("/reinsert")
	public ResponseEntity<?> save(@RequestBody Employee employee)
	{
		try {
			empService.save(employee);
			return new ResponseEntity(HttpStatus.OK).ok("saved succesfully");
			}
			catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity(HttpStatus.NOT_MODIFIED).ok("failed to save");
			}
		
	}
	@PutMapping("/reupd")
	public ResponseEntity<?> update(@RequestBody Employee employee)
	{
		try {
			empService.update(employee);
			return new ResponseEntity(HttpStatus.OK).ok("updated succesfully");
			}
			catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity(HttpStatus.NOT_MODIFIED).ok("failed to update");
			}
		
	
	}
	@DeleteMapping("/redeleteId/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id)
	{
		try {
			empService.delete(id);
			return new ResponseEntity(HttpStatus.OK).ok("deleted succesfully");
			}
			catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity(HttpStatus.NOT_MODIFIED).ok("failed to delete");
			}
		
		}
	
	
}



