package com.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bean")
public class SpringBeanApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanApplication.class, args);
	}

	@Autowired
	private MyBean myBean;

	@Resource(name = "myOtherBean")
	private MyBean myOtherBeanWithWrongName;

	
	@Autowired
	private MyBean myBeanWithMethodInjectedDependency;

	@Autowired
	private MyBean myBeanWithMethodInjectedProperties;
	
	
	@Override
	public void run(final String... s) {
		myBean.someMethod();
		myOtherBeanWithWrongName.someMethod();
		//myBeanWithoutInterface.someMethod();
		myBeanWithMethodInjectedDependency.someMethod();
		myBeanWithMethodInjectedProperties.someMethod();
	}
	
}
