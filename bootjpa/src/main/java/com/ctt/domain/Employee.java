package com.ctt.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String band;
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="dept_id")
//	private Department dept;
	
	public Employee(){super();}
	public Employee(String name,String band){this();this.name=name;this.band=band;}
	
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
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
//	public Department getDept() {
//		return dept;
//	}
//	public void setDept(Department dept) {
//		this.dept = dept;
//	}
//	
	
	
	

}
