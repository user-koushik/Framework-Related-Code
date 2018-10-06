package com.boot.spring.SpringBootDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.boot.spring")
@ComponentScan(basePackages="com.boot.spring")
@EntityScan("com.boot.spring") 
public class SpringBootDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDevApplication.class, args);
	}
}
