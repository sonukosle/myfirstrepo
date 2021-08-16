package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;

	public CourseServiceImpl() {

		list = new ArrayList<Courses>();

		// add to data in the list

		list.add(new Courses(1, "java", "this is java book written by gems"));
		list.add(new Courses(2, "python", "this is python language"));
		list.add(new Courses(3, "ReactJS", "this is react"));
		list.add(new Courses(4, "Angular", "this is angular"));
		list.add(new Courses(5, "C", "this is c language"));
		list.add(new Courses(6, "C++", "this is c++ language"));
	}

	@Override
	public List<Courses> getCourses() {

		return list;
	}

	@Override
	public Courses getCourseById(long courseId) {

		Courses c = null;
		for (Courses courses : list) {

			if (courses.getId() == courseId) {

				c = courses;
				break;
			}

		}

		return c;
	}

}
