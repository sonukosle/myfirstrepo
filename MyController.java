package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Courses;
import com.springrest.service.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
//	CourseService courseService = new CourseService();

	@RequestMapping("/home")
	public String home() {

		return "This is my home page";
	}

	// get the coureses

	@GetMapping("/courses")
	public List<Courses> getCourses() {

		return this.courseService.getCourses();
//		return null;

	}// getting the by id
	
	@GetMapping("/courses/{courseid}")
	public Courses getCourseById(@PathVariable String courseid) {

		return this.courseService.getCourseById(Long.parseLong(courseid));
		
	}

}
