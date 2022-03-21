package com.example.holam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class HolamApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolamApplication.class, args);
	}
	@RequestMapping("/")
	public String hola() {
		return "Hola mundo" ;
	}

}
