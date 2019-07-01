package com.venkat.oauth2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2DbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2DbApplication.class, args);
	}

}
