package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.*")
public class TaSimpleCrudOpertionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaSimpleCrudOpertionsApplication.class, args);
	}

}
