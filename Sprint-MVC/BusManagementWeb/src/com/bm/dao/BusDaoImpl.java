package com.bm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bm.bo.BusBO;

public class BusDaoImpl implements BusDao{
	
	//sql section
	private static final String SQL_GET_ALL_BUSES="SELECT BUS_ID,BUS_SERVICE_NO,REG_BUS,TYPE,SEATING_CAPACITY FROM BUS ORDER BY BUS_SERVICE_NO";
	private static final String SQL_GET_BUS_BY_ID="SELECT BUS_ID,BUS_SERVICE_NO,REG_BUS,TYPE,SEATING_CAPACITY FROM BUS WHERE BUS_ID=?";
	private static final String SQL_UPDATE_BUS="UPDATE BUS SET BUS_SERVICE_NO=?,REG_BUS=?,TYPE=?,SEATING_CAPACITY=? WHERE BUS_ID=?";
	
	//java code
	private JdbcTemplate jdbcTemplate;
	
	public List<BusBO> getAllBuses()
	{
		return jdbcTemplate.query(SQL_GET_ALL_BUSES,new BusRowMapper());
	}
	
	public BusBO getBusById(int busId)
	{
		BusBO bo=null;
		
		bo=jdbcTemplate.queryForObject(SQL_GET_BUS_BY_ID,new BusRowMapper(),new Object[]{busId});
		
		return bo;
	}
	
	public void updateBus(BusBO busBO)
	{
		jdbcTemplate.update(SQL_UPDATE_BUS, new Object[]{busBO.getServiceNo(),busBO.getRegdNo(),busBO.getBusType(),busBO.getSeatCapacity(),busBO.getBusId()});
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//inner class
	public static class BusRowMapper implements RowMapper<BusBO>
	{

		@Override
		public BusBO mapRow(ResultSet rs, int rowNo) throws SQLException {

			BusBO bus=null;
			
			bus=new BusBO();
			bus.setBusId(rs.getInt("BUS_ID"));
			bus.setServiceNo(rs.getString("BUS_SERVICE_NO"));
			bus.setRegdNo(rs.getString("REG_BUS"));
			bus.setBusType(rs.getString("TYPE"));
			bus.setSeatCapacity(rs.getInt("SEATING_CAPACITY"));
			
			return bus;
		}

		
	}
}
