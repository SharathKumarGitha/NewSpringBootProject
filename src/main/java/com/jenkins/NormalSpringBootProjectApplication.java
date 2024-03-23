package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NormalSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NormalSpringBootProjectApplication.class, args);
		
		System.out.println("this is simple spring boot project");
	}

}
