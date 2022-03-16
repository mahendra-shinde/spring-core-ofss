package com.mahendra.demo4;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
public class DepartmentDAO {
	
	private JdbcTemplate template;
	
	
	public List<Department> findAll(){
		List<Department> depts= template.query("select * from hr.departments", new DepartmentMapper());
		System.out.println("Departments found: "+depts.size());
		return depts;
	}


	public DepartmentDAO(JdbcTemplate template) {
		super();
		this.template = template;
	}
}
