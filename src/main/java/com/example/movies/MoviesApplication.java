package com.example.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // This annotation is needed to make this class a Spring Boot application
@RestController // The @RestController annotation tells Spring that this code describes an endpoint that should be made available over the web
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	// This method is a GET endpoint at the root of our API
	// It returns a String with the text "Hello world!"
	// The @GetMapping annotation maps HTTP GET requests onto specific handler methods
	@GetMapping("/test") // This annotation is needed to make this method a GET endpoint
	public String apiRoot() {
		return "Hello world!";
	}



}
