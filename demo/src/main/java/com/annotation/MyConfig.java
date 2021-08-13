package com.annotation;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages={"myPack"})
public class MyConfig {
	
	@Bean("student1")
	@Lazy
	public Student getStudent() {
		
		System.out.println("Creating first student object..");
		
		return new Student("student1");
	}
	
	@Bean("student2")
	@Lazy
	public Student creatingStudent() {
		
		System.out.println("Creating second student object..");
		
		return new Student("student2");
	}
	
	@Bean
	public Date getDate() {
		
		System.out.println("creating date..");
		
		return new Date();
	}

}
