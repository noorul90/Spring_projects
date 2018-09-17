package com.ca.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.ca.bo.StudentBO;

/* 
 * These classes are better to write inside the StudentDao class with private static final kewords as a inner class
 * because these class are specific to StudentDao,hence make sure no other classes within the same application will
 * be use this class functionality
 */

public final class GetAllStudentStatementCallback implements PreparedStatementCallback<List<StudentBO>> {

	@Override
	public List<StudentBO> doInPreparedStatement(PreparedStatement pstmt)
			throws SQLException, DataAccessException {
		List<StudentBO> student=null;
		ResultSet rs=null;
		student = new ArrayList<StudentBO>();
		rs = pstmt.executeQuery();
		while(rs.next()){
			StudentBO bo = new StudentBO(rs.getInt("student_id"), rs.getString("name"));
			student.add(bo);
		}
		return student;
	}
	
}
