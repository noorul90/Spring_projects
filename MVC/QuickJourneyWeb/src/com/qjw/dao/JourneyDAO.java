package com.qjw.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.qjw.bo.JourneyBO;

public class JourneyDAO {
	private static final String SQL_GET_JOURNEY_BY_DATE = "SELECT JOURNEY_ID,SOURCE,DESTINATION,JOURNEY_DT,BUS_ID FROM JOURNEY WHERE JOURNEY_DT > ?";
	private JdbcTemplate jdbcTemplate;

	public JourneyDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<JourneyBO> getJourneysBeforeDate(Date beforeDate){
		
		//System.out.println("hiiiii");
		return jdbcTemplate.query(SQL_GET_JOURNEY_BY_DATE, new RowMapper<JourneyBO>() {

			@Override
			public JourneyBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				//System.out.println("hello");
				JourneyBO bo = new JourneyBO();
				bo.setJourneyId(rs.getInt("JOURNEY_ID"));
				bo.setSource(rs.getString("SOURCE"));
				//System.out.println(rs.getString("SOURCE"));
				bo.setDest(rs.getString("DESTINATION"));
				bo.setJourneyDate(rs.getDate("JOURNEY_DT"));
				return bo;
			}
		}, new Object[]{beforeDate});
	}
	
}
