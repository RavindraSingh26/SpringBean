package com.bean;

import org.springframework.stereotype.Component;

@Component
public class MyBeanWithInjectionImpl implements MyBean{

	private final MyBean myBean;

	public MyBeanWithInjectionImpl(final MyBean myBean) {
		this.myBean = myBean;
	}
	
	@Override
	public void someMethod() {
		// TODO Auto-generated method stub
		System.out.print("from injection: ");
		myBean.someMethod();
	}

}
