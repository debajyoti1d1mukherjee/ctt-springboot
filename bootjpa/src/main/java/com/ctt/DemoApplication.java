package com.ctt;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.dao.DepartmentDAO;
import com.ctt.domain.Department;
import com.ctt.domain.Employee;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	DepartmentDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@PostConstruct
	public void init(){
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("Thomas","A"));
		employees.add(new Employee("Kate","B"));
		
		Department dept = new Department("Developers",employees);
		
		dao.save(dept);
		
	}

}

@RestController
class DemoService{
	@Autowired
	DepartmentDAO dao;
	
	@RequestMapping("/ctt/{name}")
	public Department getMessageForService(@PathVariable String name) {
		Department dept =  dao.findByName(name);
		return dept;
	}
}
