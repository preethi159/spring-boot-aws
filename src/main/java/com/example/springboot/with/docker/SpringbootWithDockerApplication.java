package com.example.springboot.with.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class SpringbootWithDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithDockerApplication.class, args);
	}

}
