package com.lnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @Configuration, @ComponentScan, @EnableAutoConfiguration ==>@SpringBootApplication
public class AzureFactoryBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureFactoryBackendApplication.class, args);
	}

}
