package com.sjt.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.sjt.bo.StudentBO;

public class StudentInsertDao {
	//SimpleJdbcTemplate supports only insert operation	
	private DataSource dataSource;
	
	public StudentInsertDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int saveStudent(StudentBO bo){
		Map<String,Object> dataMap = new HashMap<String,Object>();
		dataMap.put("student_id", bo.getId());
		dataMap.put("name", bo.getName());
		dataMap.put("mobile", bo.getMobile());
		dataMap.put("email", bo.getEmail());
		
		SimpleJdbcInsert sji = new SimpleJdbcInsert(dataSource);
		sji.setTableName("STUDENT");
		int i = sji.execute(dataMap);
		
		return i;
		
	}

	
	

}
