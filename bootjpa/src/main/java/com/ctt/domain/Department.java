package com.ctt.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="Department")
public class Department {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
	@JoinColumn(name="dept_id")
	private Set<com.ctt.domain.Employee> employees	;
	
	public Set<com.ctt.domain.Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<com.ctt.domain.Employee> employees) {
		this.employees = employees;
	}
	public Department(){super();}
	public Department(String name,Set employees){this();this.name=name; this.employees=employees;}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
