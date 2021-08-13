package com.annotation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myPack.Dog;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{

	//hrl
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	@Autowired
	private Date date;
	
	@Autowired
	private Emp emp;
	
	@Autowired
	private Dog dog;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("welcome to springboot project..");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		student.testing();
		date.getDate();
		emp.whatsYouNAme();
		dog.eating();
		
	}

}
