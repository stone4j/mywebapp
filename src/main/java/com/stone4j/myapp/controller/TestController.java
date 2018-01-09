package com.stone4j.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stone4j.myapp.mapper.test1.User1Mapper;


@RestController
public class TestController {

	@Autowired
	User1Mapper userDao;
	@RequestMapping("/helloworld")
	public String getHelloWorld(){
		
		return "HelloWorld";
		
	}
	
	@RequestMapping("/delete")
	public String deletebyDb(){
		userDao.delete("28");
		//User1 find = userDao.find(28L);
		return "deleteok";
	}
}
