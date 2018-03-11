package com.ctt.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ctt.domain.Department;

public interface DepartmentDAO extends CrudRepository<Department, Long>{
	List<Department>findAll();
	Department findByName(String name);

}
