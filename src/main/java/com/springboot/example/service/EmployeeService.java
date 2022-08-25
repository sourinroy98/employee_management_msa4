package com.springboot.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.example.entity.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> employees = new ArrayList<>(Arrays.asList(
			new Employee(1,"Aman",30000),
			new Employee(2,"Sayak",20000),
			new Employee(3,"John",40000),
			new Employee(4,"Mac",35000),
			new Employee(5,"Bob",25000),
			new Employee(6,"Soumya",15000),
			new Employee(7,"Jill",10000),
			new Employee(8,"Abhi",18000),
			new Employee(9,"Mayuk",26000),
			new Employee(10,"Devil",29000)	
			));
	
	public List<Employee> getAllEmployee()
	{
		return employees;
	}
	
	public Employee getEmployee(Integer id)
	{
		return employees.stream().filter(t-> t.getId()==id).findFirst().get();
	}

}
