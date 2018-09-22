package com.ac.profile.annon;

public class JdbcDataSourceImpl implements DataSource {

	@Override
	public void ping() {
		System.out.println("success of jdbc DataSource.....");
	}
	

}
