package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@GetMapping("/hello")
public String sayHello() {
	return "hello world";
}
public static void main(String[] args) {
		System.out.println("soham plays piano");
		SpringApplication.run(DemoApplication.class, args);
	}

}
