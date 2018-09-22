package com.ac.profile.annon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Dev")
public class DevAppConfig {
	@Bean(name="dataSource")
	public DataSource newDataSource(){
		DataSource ds = new JdbcDataSourceImpl();
		return ds;
	}

}
