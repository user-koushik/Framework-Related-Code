package com.core.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// If you want to to access the customer instance but if the class doesn't have the @Component or any XML definition then we need
//to use the @Configuration to maintain the relationship

@Configuration
public class Bank {
	
	// If you want to get the method level instances you need to use the @Bean annotation
	@Bean
	public Customer getInstance(){
		return new Customer();
	}
}
