package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppWithInjectionConfig {

	@Autowired
	private MyBean myOtherBean;

	@Bean
	public MyBean myBeanWithInjection(final MyBean myBean) {
		return new MyBeanWithInjectionImpl(myBean);
	}

	@Bean
	public MyBean myOtherBeanWithInjection(@Qualifier("myOtherBean") final MyBean myBean) {
		return new MyBeanWithInjectionImpl(myBean);
	}

	@Bean
	public MyBean myBeanWithAutowiredDependency() {
		return new MyBeanWithInjectionImpl(myOtherBean);
	}

	@Bean
	public MyBean myBeanWithMethodInjectedDependency() {
		return new MyBeanWithInjectionImpl(myBeanWithAutowiredDependency());
	}
}
