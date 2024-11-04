package com.example.LearnSpringboot;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class User {
	private int salary;
	private String jobLocation;
	private String fullName;
	private int age;

	@Autowired
	public Todo todo;

	@PostConstruct
	public void postBean(){
		System.out.println("Bean has been created and dependency has been injected");
		System.out.println("Waiting for the Upcoming set");
	}

	@PreDestroy
	public void destroyBean(){
		System.out.println("The Bean has been destroyed from the application");
	}

	public User() {
		System.out.println("User Bean Initialized");
	}

//	public User(int salary, String jobLocation, String fullName, int age){
//		this.salary = salary;
//		this.jobLocation = jobLocation;
//		this.fullName = fullName;
//		this.age = age;
//	}

	public void setSalary(int salary){
		this.salary = salary;
	}

	public int getSalary(){
		return salary;
	}

	public void setJobLocation(String jobLocation){
		this.jobLocation = jobLocation;
	}

	public String getJobLocation(){
		return jobLocation;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return 
			"Todo{" + 
			"salary = '" + salary + '\'' + 
			",jobLocation = '" + jobLocation + '\'' + 
			",fullName = '" + fullName + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}
