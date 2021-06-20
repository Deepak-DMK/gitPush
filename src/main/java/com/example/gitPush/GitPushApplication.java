package com.example.gitPush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitPushApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitPushApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getData() {
		return "Hi Deepak, it's latest change";
	}

}
