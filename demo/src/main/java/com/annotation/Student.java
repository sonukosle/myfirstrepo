package com.annotation;

public class Student {

	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void testing() {

		System.out.println(this.name + " i am testing..");
	}

}
