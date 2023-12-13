package com.task.springbootapp;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootappApplication implements CommandLineRunner {
	
	public  static final Logger logger =LoggerFactory.getLogger(SpringbootappApplication.class);

	public static void main(String[] args) {
		
		logger.info("hi logger is wokring fine");
		SpringApplication.run(SpringbootappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("hi logger is wokring fine second time");
		
	}

}
