package com.ca.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ca.bo.StudentBO;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<StudentBO> getAllStudent(){
		return jdbcTemplate.execute(new GetAllStudentStatementCreator(), new GetAllStudentStatementCallback());
	}

}
