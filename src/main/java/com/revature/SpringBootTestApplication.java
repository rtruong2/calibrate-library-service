package com.revature;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@EnableJpaRepositories
public class SpringBootTestApplication {	
	


	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
}
