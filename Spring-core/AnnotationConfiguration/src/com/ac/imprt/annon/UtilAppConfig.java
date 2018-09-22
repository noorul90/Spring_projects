package com.ac.imprt.annon;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class UtilAppConfig {
	@Bean(name="appProps")
	public Properties newAppProperties() throws IOException{
		Properties props = new Properties();
		props.load(this.getClass().getResourceAsStream("app_val.properties"));
		return props;
	}

}
