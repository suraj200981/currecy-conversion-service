package com.example.microservice.currecyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrecyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrecyConversionServiceApplication.class, args);
	}

}
