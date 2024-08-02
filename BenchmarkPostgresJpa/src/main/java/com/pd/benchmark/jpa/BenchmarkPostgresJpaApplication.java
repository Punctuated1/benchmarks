package com.pd.benchmark.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pd.benchmark.jpa")

public class BenchmarkPostgresJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BenchmarkPostgresJpaApplication.class, args);
	}

}
