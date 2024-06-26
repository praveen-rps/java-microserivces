package com.example.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.doctor")
public class DoctorCrudJpaRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorCrudJpaRestProjectApplication.class, args);
	}

}
