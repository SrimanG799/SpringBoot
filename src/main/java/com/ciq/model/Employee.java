package com.ciq.model;

public class Employee {
	private Integer id;
	private String name;
	private String company;
	private String roll;
	private Double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, String company, String roll, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.roll = roll;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", roll=" + roll + ", salary="
				+ salary + "]";
	}
	

}
