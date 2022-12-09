package com.notsohan.noteTaking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NoteTakingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteTakingApplication.class, args);
	}
}
