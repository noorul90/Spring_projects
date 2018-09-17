package com.qa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.qa.bo.StudentBO;
import com.qa.bo.StudentDetailsBO;

public class StudentDao {
	private final String SQL_GET_NO_OF_STUDENT = "SELECT COUNT(1) FROM STUDENT";
	private final String SQL_FIND_STUDENT_NAME_BY_ID = "SELECT NAME FROM STUDENT WHERE STUDENT_ID = ?";
	private final String SQL_FIND_STUDENT_BY_ID = "SELECT STUDENT_ID, NAME FROM STUDENT WHERE STUDENT_ID = ?";
	private final String SQL_GET_STUDENT_BY_NAME = "SELECT STUDENT_ID, NAME FROM STUDENT WHERE NAME LIKE ?";
	private final String SQL_GET_ALL_STUDENTS_NAME_AND_MOBILE = "SELECT NAME, MOBILE FROM STUDENT";

	private final String SQL_GET_STUDENTS_AND_THEIR_COURSE = "SELECT S.*, C.NAME FROM STUDENT S, COURSE C, STUDENT_COURSE SC WHERE S.STUDENT_ID=SC.STUDENT_ID AND SC.COURSE_ID=C.COURSE_ID";

	private final String SQL_INSERT_STUDENT_WITHOUT_ID = "INSERT INTO STUDENT(NAME, MOBILE, EMAIL) VALUES(?,?,?)";

	private JdbcTemplate jdbcTemplate;

	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// inner class for mapping 1 row into a StudentBO class object
	private static final class StudentBoRowMapper implements
			RowMapper<StudentBO> {
		@Override
		public StudentBO mapRow(ResultSet rs, int row) throws SQLException {
			return new StudentBO(rs.getInt("student_id"), rs.getString("name"));
		}

	}

	/*
	 * // INNER CLASS--RollUp logic private final static class
	 * StudentBOResultSetExtractor implements
	 * ResultSetExtractor<List<StudentBO>> { private int startIndex; private int
	 * endIndex;
	 * 
	 * public StudentBOResultSetExtractor(int startIndex, int endIndex) {
	 * this.startIndex = startIndex; this.endIndex = endIndex; }
	 * 
	 * @Override public List<StudentBO> extractData(ResultSet rs) throws
	 * SQLException, DataAccessException { List<StudentBO> students = null; int
	 * rowNo = 1; StudentBO studentBO = null; students = new
	 * ArrayList<StudentBO>();
	 * 
	 * while (rs.next() && rowNo <= endIndex) { if (rowNo >= startIndex) {
	 * studentBO = new StudentBO(rs.getString("NAME"), rs.getInt("MOBILE"),
	 * rs.getString("EMAIL")); students.add(studentBO); } rowNo++; } return
	 * students; }
	 * 
	 * }
	 */

	// inner class for rollup logic
	private final static class StudentDetailsBoResultSetExtractor implements
			ResultSetExtractor<List<StudentDetailsBO>> {

		@Override
		public List<StudentDetailsBO> extractData(ResultSet rs)
				throws SQLException, DataAccessException {
			int studentId = 0;
			int i = 0;
			List<StudentDetailsBO> lsdbo = null;
			StudentDetailsBO studentDetailsBo = null;
			StudentBO studentBo = null;

			lsdbo = new ArrayList<StudentDetailsBO>();
			while (rs.next()) {
				studentId = rs.getInt("student_id");
				studentDetailsBo = findStudentDetails(lsdbo, studentId);
				if (studentDetailsBo == null) {
					studentBo = new StudentBO(rs.getInt("student_id"),
							rs.getString("name"), rs.getLong("mobile"),
							rs.getString("email"));

					studentDetailsBo = new StudentDetailsBO();
					studentDetailsBo.setStudentBo(studentBo);
					studentDetailsBo.getCources().add(rs.getString("name"));// courseNm
					lsdbo.add(studentDetailsBo);

				} else {
					studentDetailsBo.getCources().add(rs.getString("name"));// courseNm
				}

			}

			return lsdbo;
		}

		// INNER class method
		private StudentDetailsBO findStudentDetails(
				List<StudentDetailsBO> lsdbo, int studentId) {
			StudentBO studentBo = null;
			StudentDetailsBO studentDetailsBo = null;

			if (lsdbo != null && lsdbo.size() > 0) {
				for (StudentDetailsBO student : lsdbo) {
					studentBo = student.getStudentBo();
					if (studentBo.getId() == studentId) {
						studentDetailsBo = student;
						break;
					}
				}
			}
			return studentDetailsBo;
		}
	}

	// Auto Generated primary key logic
	public int saveStudentWithoutId(final String name, final int mobile, final String email) {
		KeyHolder holder = new GeneratedKeyHolder();
		// annonymous inner class
		int rowCount = jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement pstmt = con.prepareStatement(
						SQL_INSERT_STUDENT_WITHOUT_ID,
						new String[] { "STUDENT_ID" });
				pstmt.setString(1, name);
				pstmt.setInt(2, mobile);
				pstmt.setString(3, email);

				return pstmt;
			}
		}, holder);// end annonymous class and method call

		// Long id=(Long) holder.getKey();
		System.out.println("Genereted key : " + holder.getKey());

		return rowCount;
	}

	// if method return collections of value then name the method as getter
	// method means method name start with get
	// Aggregate Query
	public int getNoOfStudents() {
		return jdbcTemplate.queryForInt(SQL_GET_NO_OF_STUDENT);
	}

	// if method return 1 value then name the method as finder method means
	// method name start with find
	// selecting 1 row 1 column
	public String findStudentNameById(int id) {
		return jdbcTemplate.queryForObject(SQL_FIND_STUDENT_NAME_BY_ID,
				String.class, new Object[] { id });

	}

	// selecting 1 record/row of data
	public StudentBO findStudentById(int id) {
		return jdbcTemplate.queryForObject(SQL_FIND_STUDENT_BY_ID,
				new Object[] { id }, new StudentBoRowMapper());
	}

	// selecting multiple record/rows of data
	public List<StudentBO> getAllStudents(String name) {
		// String[] args = {"%"+name+"%"};
		// return jdbcTemplate.query(SQL_GET_STUDENT_BY_NAME, args, new
		// StudentBoRowMapper());
		return jdbcTemplate.query(SQL_GET_STUDENT_BY_NAME,
				new Object[] { name }, new StudentBoRowMapper());
	}

	// selecting multiple record of partial columns from table (partial query)
	public List<Map<String, Object>> getAllStudentsNameAndMobile() {
		return jdbcTemplate.queryForList(SQL_GET_ALL_STUDENTS_NAME_AND_MOBILE);
	}

	// Roll-up concept
	public List<StudentDetailsBO> getAllStudentsAndTheirCourses() {
		return jdbcTemplate.query(SQL_GET_STUDENTS_AND_THEIR_COURSE,
				new StudentDetailsBoResultSetExtractor());
	}

}
