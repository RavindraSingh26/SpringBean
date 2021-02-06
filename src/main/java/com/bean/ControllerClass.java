package com.bean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi")
public class ControllerClass {

	@RequestMapping(value ="/hello",method = RequestMethod.GET)
	public String getHello() {
		
		return "Hello Docker Integration";
	}
}
