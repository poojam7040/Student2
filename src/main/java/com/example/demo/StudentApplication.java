package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Service.StudentServiceImpl;
import com.example.demo.entity.Student;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(StudentApplication.class, args);
		StudentServiceImpl bean=context.getBean(StudentServiceImpl.class);
		Student std=new Student( "Pooja", "7867854356");
		Student std1=new Student("Sangita", "9874231425");
		Student std2=new Student("Arun", "7825342789");
		Student std3=new Student("Vaibhav", "7825652789");

		bean.saveStudent(std);
		bean.saveStudent(std1);
		bean.saveStudent(std2);
		bean.saveStudent(std3);
		
        
		
	}

}
