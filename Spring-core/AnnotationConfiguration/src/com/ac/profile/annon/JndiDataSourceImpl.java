package com.ac.profile.annon;

public class JndiDataSourceImpl implements DataSource {

	@Override
	public void ping() {
		System.out.println("success of jndi DataSource....");
	}
	

}
