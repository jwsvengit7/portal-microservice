package com.example.enroll_student_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EnrollStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrollStudentServiceApplication.class, args);
	}

}
