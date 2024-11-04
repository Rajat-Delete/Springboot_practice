package com.example.LearnSpringboot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Todo{
	private String firstname;

	public Todo(){
		System.out.println("Todo Bean Initialized");
	}

	@PostConstruct
	public void postBean(){
		System.out.println("Todo Bean has been created and dependency has been injected");
		System.out.println("Todo Bean Waiting for the Upcoming set");
	}

	@PreDestroy
	public void destroyBean(){
		System.out.println("The todo Bean has been destroyed from the application");
	}

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	@Override
 	public String toString(){
		return 
			"Todo{" + 
			"firstname = '" + firstname + '\'' + 
			"}";
		}
}
