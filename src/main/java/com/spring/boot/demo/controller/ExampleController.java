package com.spring.boot.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.demo.service.ExampleService;

@RestController
//启用自动配置:由于添加了spring-boot-starter-web所以 spring boot将其关联tomcat和spring mvc
@RequestMapping("/exampleController")
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ExampleController {
	@Autowired
	private ExampleService exampleService; 
	
	@RequestMapping("/hello")
	String hello() {
	    return "Hello World!";
	}
	
	@RequestMapping("/getUserInfo")
	Map getUserInfo(){
		Map user = new HashMap();
		user.put("user_id", 1);
		user = exampleService.findUser(user);
		return user;
	}
}
