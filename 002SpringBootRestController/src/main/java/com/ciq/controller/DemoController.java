package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ciq.model.Employee;

@RestController
public class DemoController {
	@Autowired
RestTemplate restTemplate;
	
	
//	@GetMapping("/emp/getAll")
//	public String callEmpFindAllServ()
//	{
//		return restTemplate.getForObject("http://localhost:8080/getEmp",String.class );
//		
//	}
	
	@GetMapping("/re/empGetAll")
	public Employee[] getEmpReAll()
	{
		
		return 	restTemplate.getForObject("http://localhost:8080/regetEmp", Employee[].class);
		
		
	}
	
	@PostMapping("/re/insert")
	public ResponseEntity<?> saveEmp(@RequestBody Employee employee)
	{
		return restTemplate.postForEntity("http://localhost:8080/reinsert", employee,Employee.class);
		
	}
	
	
	
	@PutMapping("/re/upd")
	
		public void update(@RequestBody Employee employee)
		{
		restTemplate.put("http://localhost:8080/reupd", employee);
		
			
		}
	
	
	@DeleteMapping("re/delete/{id}")
	public void delete(@PathVariable Integer id)
	{
		//restTemplate.delete("http://localhost:8080/redeleteId/{id}");
		//restTemplate.delete("http://localhost:8080/redeleteId/{id}", Employee.class);
		
		restTemplate.delete("http://localhost:8080/redeleteId/{id}", id);
	}
	
	@GetMapping("re/getById/{id}")
	public ResponseEntity<Employee> getById(@PathVariable Integer id)
	{
		return restTemplate.getForEntity("http://localhost:8080/regetId/{id}", Employee.class, id);
		
	}
	
	
	
	
	
	
}

