package com.bugeater.bugeaterIntern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bugeater.bugeaterIntern")
public class BugeaterInternApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugeaterInternApplication.class, args);
	}

}
