package com.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanApplication.class, args);
	}

	/*
	 * @Autowired private MyBean myBean;
	 * 
	 * @Resource(name = "myOtherBean") private MyBean myOtherBeanWithWrongName;
	 * 
	 * 
	 * @Autowired private MyBean myBeanWithMethodInjectedDependency;
	 * 
	 * @Autowired private MyBean myBeanWithMethodInjectedProperties;
	 * 
	 * 
	 * @Override public void run(final String... s) { myBean.someMethod();
	 * myOtherBeanWithWrongName.someMethod(); //myBeanWithoutInterface.someMethod();
	 * myBeanWithMethodInjectedDependency.someMethod();
	 * myBeanWithMethodInjectedProperties.someMethod(); }
	 */
}
