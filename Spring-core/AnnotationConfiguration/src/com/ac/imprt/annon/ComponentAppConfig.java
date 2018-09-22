package com.ac.imprt.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan("com.ac.imprt.*")
@Import(UtilAppConfig.class)
public class ComponentAppConfig {
	
	@Bean(name="motor", autowire=Autowire.BY_TYPE)
	public Motor newMotor(){
		Motor motor = new Motor();
		return motor;
	}
	
	@Bean(name="chain")
	public Chain newChain(){
		Chain chain = new Chain();
		return chain;
	}

}
