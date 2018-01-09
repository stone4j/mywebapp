package com.stone4j.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration/*(exclude={DataSourceAutoConfiguration.class})*/
public class Stone4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stone4jApplication.class, args);
		
	}
}
