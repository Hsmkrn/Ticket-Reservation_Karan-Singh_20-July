package com.example.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springlearning.Service.IStudentService;
import com.example.springlearning.config.AppConfig;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PractiseSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PractiseSpringApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IStudentService studentService = context.getBean(IStudentService.class);
        studentService.disp();
	}

}
