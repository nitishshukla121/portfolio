package com.example.Spring.Thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories("com.example.Spring.Repository")
@EntityScan("com.example.Spring.Entity")
public class ThymeleafPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafPracticeApplication.class, args);
	}

}
