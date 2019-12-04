package com.example.ninja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;






@SpringBootApplication
@ComponentScan("com.example")
@CrossOrigin("http://localhost:4200")
@EntityScan(basePackages = {"com.example.model"})
@EnableJpaRepositories(basePackages = {"com.example.dao"})

public class NinjaApplication {

	public static void main(String[] args) {
		System.out.println("test1");
		SpringApplication.run(NinjaApplication.class, args);
	}

}
