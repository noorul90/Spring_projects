package com.ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

/* 
 * These classes are better to write inside the StudentDao class with private static final kewords as a inner class
 * because these class are specific to StudentDao,hence make sure no other classes within the same application will
 * be use this class functionality
 */

public final class GetAllStudentStatementCreator implements PreparedStatementCreator {
	private final String SQL_GET_ALL_STUDENT = "SELECT STUDENT_ID, NAME FROM STUDENT"; 
	
	@Override
	public PreparedStatement createPreparedStatement(Connection con)
			throws SQLException {
		PreparedStatement pstmt = con.prepareStatement(SQL_GET_ALL_STUDENT);
		return pstmt;
	}
	
}
