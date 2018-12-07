package com.hyomins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component(value = "com.hyomins")
public class HyominsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyominsApplication.class, args);
	}
}
