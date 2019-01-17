package com.princedonkor.stock.dbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.princedonkor.stock.dbservice.repository") // We have to enable jpa due to us using it to communicate with our database,
// We also needed to give it a base Package to tell where exactly is that jpa file is located.
@SpringBootApplication
public class DbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbServiceApplication.class, args);
	}

}

