package com.example.gcptestproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//we are excluding this to not get an error which is coming due to Spring Data JPA dependency that's looking for a database.
public class GcpTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpTestProjectApplication.class, args);
	}

}
