package com.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annotation.Student;

@Controller
public class MyController {
	
	@Autowired
	@Qualifier("student1")
	private Student student;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public Student home() {

		System.out.println("this is home method..");
		
		this.student.setName("Sunny kosle");

		return this.student;
	}

}
