package com.akg.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestServiceApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
		System.out.println("Hello World!");

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RestServiceApplication.class);
	}

}
