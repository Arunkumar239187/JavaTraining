package com.ust.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableWebSecurity
@RestController
@RequestMapping("/h")
public class SecurityApplication {

	@GetMapping("/hi")
	public String greet()
	{
		return "welcome";
	}
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}
