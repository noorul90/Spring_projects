package com.ac.profile.annon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
@Profile("Test")
public class TestAppConfig {
	@Bean(name="dataSource")
	public DataSource newDataSource(){
		DataSource dataSource = new JndiDataSourceImpl();
		return dataSource;
	}

}
