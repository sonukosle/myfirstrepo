package com.springrest.service;

import java.util.List;

import com.springrest.entity.Courses;

public interface CourseService {
	
	public List<Courses>getCourses();
	
	public Courses getCourseById(long courseId);

}
