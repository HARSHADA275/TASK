package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Category;
import com.demo.service.CategoryService;

@SpringBootApplication
public class NpApplication {

	public static void main(String[] args) {
	SpringApplication.run(NpApplication.class, args);
	
	}

}
