package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsStarterDemoApplication {

	@PostConstruct
	public void initializeApp() {
		System.out.println("App is initializing ...");
	}

	public static void main(String[] args) {
		System.out.println("Spring Application is starting ...");
		SpringApplication.run(JenkinsStarterDemoApplication.class, args);
	}

}
