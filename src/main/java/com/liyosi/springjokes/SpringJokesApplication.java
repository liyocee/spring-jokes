package com.liyosi.springjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJokesApplication.class, args);
	}
}
