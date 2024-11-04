package com.example.LearnSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnSpringbootApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringbootApplication.class,args);
//		context.close();
	}

}
