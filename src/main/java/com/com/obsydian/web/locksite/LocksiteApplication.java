package com.com.obsydian.web.locksite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class LocksiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocksiteApplication.class, args);
	}

}
