package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public MyBean myBean() {
		
		return (MyBean) new MyBeanImpl(); 
		
	}
	
	@Bean({"myOtherBean", "beanNameTwo"})
	public MyBean myOtherBeanWithDifferentName() {
		return (MyBean) new MyOtherBeanImpl();
	}
}
