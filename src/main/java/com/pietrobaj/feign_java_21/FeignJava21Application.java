package com.pietrobaj.feign_java_21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignJava21Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignJava21Application.class, args);
	}

}
