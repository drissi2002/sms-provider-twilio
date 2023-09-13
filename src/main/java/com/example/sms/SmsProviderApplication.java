package com.example.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SmsProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsProviderApplication.class, args);
	}

}

