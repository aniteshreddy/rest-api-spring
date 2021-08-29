package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.anitesh")
public class RestApiConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiConsumerApplication.class, args);
	}

}
