package com.npjt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.npjt.bo.StudentBO;

public class StudentDao {
	private final String SQL_GET_NO_OF_STUDENTS_IN_A_COURSE = "SELECT COUNT(1) FROM STUDENT S, COURSE C, STUDENT_COURSE SC WHERE S.STUDENT_ID=SC.STUDENT_ID AND SC.COURSE_ID=C.COURSE_ID AND C.NAME LIKE :pcourse_nm";
	private final String SQL_FIND_STUDENT_BY_ID = "SELECT STUDENT_ID,NAME,MOBILE,EMAIL FROM STUDENT WHERE STUDENT_ID = :p_sid";
	private final String SQL_GET_STUDENT_BY_NAME = "SELECT STUDENT_ID,NAME,MOBILE,EMAIL FROM STUDENT WHERE NAME LIKE :STUDENT_NAME";
	private final String SQL_UPDATE_STUDENT = "UPDATE STUDENT SET NAME=:name, MOBILE=:mobile, EMAIL=:email WHERE STUDENT_ID=:id";
	
	private NamedParameterJdbcTemplate npJdbcTemplate;

	public StudentDao(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}
	// inner class for mapping 1 row into a StudentBO class object
		private static final class StudentBoRowMapper implements RowMapper<StudentBO>{
			@Override
			public StudentBO mapRow(ResultSet rs, int row) throws SQLException {
				return new StudentBO(rs.getInt("student_id"),rs.getString("name"),rs.getLong("mobile") ,rs.getString("email"));
			}
			
		}
		
		public int getNoOfStudentsInACourse(String courseName){
			Map<String,Object> paramMap = new HashMap<String, Object>();
			paramMap.put("pcourse_nm", courseName);
			return npJdbcTemplate.queryForInt(SQL_GET_NO_OF_STUDENTS_IN_A_COURSE, paramMap);
		}
		// 1st method
		public StudentBO findStudentsById(int id){
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("p_sid", id);
			return npJdbcTemplate.queryForObject(SQL_FIND_STUDENT_BY_ID, paramMap, new StudentBoRowMapper());
		}
		//2nd method
		public StudentBO findStudentById(int id){
			MapSqlParameterSource paramSource = new MapSqlParameterSource();
			paramSource.addValue("p_sid", id);
			return npJdbcTemplate.queryForObject(SQL_FIND_STUDENT_BY_ID, paramSource, new StudentBoRowMapper());
		}
	
	    public List<StudentBO> getStudentByName(String sname){
		    SqlParameterSource paramMap = new MapSqlParameterSource("STUDENT_NAME",sname);
		    return npJdbcTemplate.query(SQL_GET_STUDENT_BY_NAME, paramMap, new StudentBoRowMapper());
	    }
	    
	    public int updateStudent(StudentBO bo){
	    	MapSqlParameterSource paramSource = new MapSqlParameterSource();
	    	paramSource.addValue("id", bo.getId());
	    	paramSource.addValue("name", bo.getName());
	    	paramSource.addValue("mobile", bo.getMobile());
	    	paramSource.addValue("email", bo.getEmail());
	    	
	    	//BeanPropertySqlParameterSource 
	    	
	    	return npJdbcTemplate.update(SQL_UPDATE_STUDENT, paramSource);
	    }
	
	

}
