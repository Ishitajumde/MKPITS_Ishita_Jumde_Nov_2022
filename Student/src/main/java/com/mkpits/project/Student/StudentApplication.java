package com.mkpits.project.Student;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(StudentApplication.class, args);
	}



}
