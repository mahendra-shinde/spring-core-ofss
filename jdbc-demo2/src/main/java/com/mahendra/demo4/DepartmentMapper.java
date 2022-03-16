package com.mahendra.demo4;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DepartmentMapper implements RowMapper<Department> {

	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department dept = new Department();
		dept.setDeptId(rs.getInt("department_id"));
		dept.setLocationId(rs.getInt("location_id"));
		dept.setManagerId(rs.getInt("manager_id"));
		dept.setName(rs.getString("department_name"));
		return dept;
	}

}
